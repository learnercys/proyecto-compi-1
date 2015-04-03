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

    @Override
    public void replaceText(int start, int end, String replace) {
        super.replaceText(start, end, replace);
    }

    public void replaceText( String replace ) {
        this.replaceText(0, this.getLength(), replace);
    }

}
