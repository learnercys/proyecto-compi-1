package net.project.components;

import net.project.lexer.configuration.ConfigurationLexer;
import net.project.parser.configuration.ConfigurationParser;

import java.io.StringReader;


/**
 * @author learnercys (learner.cys@gmail.com)
 * Created on 3/04/15.
 */
public class ConfigArea extends AbstractArea {

    private ConfigurationLexer lexer;
    private ConfigurationParser parser;

    /**
     * TODO verify if the current area has errors
     * @return has errors?
     */
    public boolean hasErrors ( ) {
        return lexer != null && lexer.hasErrors();
    }

    public ConfigurationLexer getLexer() {
        return this.lexer;
    }

    /**
     * do compilation to configuration area.
     */
    public void doCompilation ( ) {
        if( this.getText().trim().length() == 0 ) {
            // verify empty content
            showError("No Content", "No content", "The current configuration editor is empty");
            return;
        }

        if( !this.isSaved()) {
            // verify the current file
            showError("No file", "File no saved", "You need to save the file.");
            return;
        }

        StringReader stringReader = new StringReader( this.getText() );
        lexer = new ConfigurationLexer(stringReader);
        parser = new ConfigurationParser(lexer);

        try {
            parser.parse();

            if( parser.hasUnRecoveredSyntaxError ) {
                showError("Syntax Error", "The app has an un-recovered syntax error, verify your structure.");
            }
        }  catch (Exception npe) {
            // do nothing
        }
    }

    public void resetArea ( ) {
        resetSymbols();
        resetErrors();
        removeText();
        setFile(null);

    }

    /**
     * reset errors.
     */
    public void resetErrors() {
        if( hasErrors() ) {
            this.lexer.errors.clear();
        }
    }

    /**
     * TODO reset symbols
     */
    public void resetSymbols() {

    }


}
