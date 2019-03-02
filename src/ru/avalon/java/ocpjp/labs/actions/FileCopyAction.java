package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileCopyAction implements Action {
    final String adrstartfile="";
    final String adrfinishfile="";
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        File oldfile = new File(adrstartfile);
        File newfile = new File(adrfinishfile);
        
        try {
            FileInputStream in = new FileInputStream(oldfile);
            FileOutputStream out = new FileOutputStream(newfile);
         } catch (FileNotFoundException ex) {
            Logger.getLogger(FileCopyAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
