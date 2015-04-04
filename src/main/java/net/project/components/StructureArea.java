package net.project.components;


import net.project.lexer.structure.StructureLexer;
import net.project.parser.structure.StructureParser;

import java.io.StringReader;

/**
 * @author learnercys (learner.cys@gmail.com)
 * Created on 3/04/15.
 */
public class StructureArea extends AbstractArea {

    /**
     * do compilation to structure area.
     */
    public void doCompilation() {
        if( this.getText().trim().length() == 0 ) {
            showError("No Content", "No content", "The current structure editor is empty");
            return;
        }

        if( !this.isSaved() ) {
            showError("No File", "You need to save the file");
            return;
        }

        StringReader stringReader = new StringReader( this.getText() );
        StructureLexer lexer = new StructureLexer( stringReader );
        StructureParser parser = new StructureParser( lexer );

        try {
            parser.parse();
            if( parser.hasUnRecoveredSyntaxError ) {
                showError("Syntax Error", "The app has an un-recovered syntax error,verify your structure.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetArea ( ) {
        resetSymbols();
        resetErrors();
        removeText();
        setFile(null);
    }

    /**
     * TODO reset errors
     */
    public void resetErrors() {

    }

    /**
     * TODO reset symbols
     */
    public void resetSymbols() {

    }
    /**
     * TODO verify if the current area has errors
     *
     * @return has errors?
     */
    public boolean hasErrors ( ) {
        return false;
    }
}
