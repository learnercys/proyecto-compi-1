package net.project.utils;

import java.io.*;

/**
 * @author learnercys (learner.cys@gmail.com)
 *         Created on 3/04/15.
 */
public class CFile extends File {

    public CFile( String pathName ) {
        super(pathName);
    }

    public CFile( File file ) {
        this(file.getAbsolutePath());
    }

    /**
     * Read the current file
     *
     * @return The content to the current file
     */
    public String read() {
        return read(this);
    }

    public static String read( File file ) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String newLine = "", text;

            while ( (text = bufferedReader.readLine()) != null ) {
                stringBuilder.append( newLine );
                stringBuilder.append( text );
                newLine = "\n";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return stringBuilder.toString();
    }

    public void saveFile( String newText ) {
        try {
            PrintWriter printWriter = new PrintWriter( this.getAbsolutePath() );
            String [] lines = newText.split("\n");
            for(String line: lines) {
                printWriter.println( line );
            }
            printWriter.close();
        } catch (FileNotFoundException ex ) {
            // do nothing. something really rare happened.
        }
    }

    public static boolean createDirectory ( String dir ) {
        return new File(dir).mkdirs();
    }

    public static boolean createFile ( String f ) {
        try {
            return new File( f ).createNewFile();
        } catch ( IOException e ) {
            return false;
        }
    }

    public static String getExtension( File file ) throws NullPointerException{
        if( file.getName().lastIndexOf( "." ) < 0 ) {
            return null;
        }
        return file.getName().substring( file.getName().lastIndexOf( "." ) + 1, file.getName().length() );
    }

}
