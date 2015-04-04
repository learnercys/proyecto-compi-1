package net.project.components;

import net.project.utils.CFile;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

/**
 * @author learnercys (learner.cys@gmail.com)
 * Created on 3/04/15.
 */
public abstract class AbstractArea extends CodeArea {

    private CFile file;

    public AbstractArea( ) {
        this( true ); // because the world is so cruel, or not.
    }

    public AbstractArea( boolean codeLine ) {
        if ( codeLine ) {
            super.setParagraphGraphicFactory(LineNumberFactory.get( this ) );
        }
    }

    /**
     * Indicate if the current area code is saved or not.
     *
     * When is saved?
     * 1.   if the current code area does not have some text and the file is null.
     *      Nothing exist, so we don't need to save.
     *
     * 2.   if the current code area have some text and this text is the same to the
     *      current file.
     *
     * @return really?
     */
    public boolean isSaved ()  {
        try {
            return this.getText().trim().length() == 0 && this.file == null
                    || this.getText().equals( this.file.read() );

        } catch ( NullPointerException ex) {
            return false;
        }
    }

    public void removeText( ) {
        replaceText("");
    }

    @Override
    public void replaceText(int start, int end, String replace) {
        super.replaceText(start, end, replace);
    }

    public void replaceText( String replace ) {
        this.replaceText(0, this.getLength(), replace);
    }

    public void setFile ( CFile file ) {
        this.file = file;
        if( file != null ) {
            this.replaceText(file.read());
        }
    }

    public CFile getFile ( ) {
        return this.file;
    }

    abstract void doCompilation();

    abstract void resetArea();

    abstract void resetErrors();

    abstract void resetSymbols();

    abstract boolean hasErrors();

}
