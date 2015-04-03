package net.project.components;

/**
 * @author learnercys (learner.cys@gmail.com)
 * Created on 3/04/15.
 */
public class ConfigArea extends AbstractArea {

    /**
     * TODO do compilation to configuration area.
     */
    public void doCompilation ( ) {

    }

    public void resetArea ( ) {
        resetSymbols();
        removeText();
    }

    /**
     * TODO reset symbols
     */
    public void resetSymbols() {

    }

    /**
     * TODO verify if the current area has errors
     * @return has errors?
     */
    public boolean hasErrors ( ) {
        return false;
    }
}
