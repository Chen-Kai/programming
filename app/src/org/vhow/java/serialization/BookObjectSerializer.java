package org.vhow.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookObjectSerializer {

	// The object to be serialized.
	private Book mBook;

	// The file to write mBook to and read it from, it's a disk file.
	private File mBookFile;

	// Writing data to OBJECT_FILE.
	private FileOutputStream mFileOutputStream;

	// Writing mBook to mFileOutputStream.
	private ObjectOutputStream mObjectOutputStream;

	// Reading bytes from OBJECT_FILE.
	private FileInputStream mFileInputStream;

	// Reading mBook from mFileInputStream.
	private ObjectInputStream mObjectInputStream;

	public BookObjectSerializer() {
		mBook = new Book();
		mBook.setName("Android Applications Development");
		mBook.setPrice(99.0F);
		mBookFile = new File("./book.obj");
	}
	
	public Book getBookObject() {
		return mBook;
	}

	public File writeObject() throws Exception {
		mFileOutputStream = new FileOutputStream(mBookFile);
		mObjectOutputStream = new ObjectOutputStream(mFileOutputStream);

		// Write the specified object to the ObjectOutputStream.
		mObjectOutputStream.writeObject(mBook);
		
		return mBookFile;
	}

	public Book readObject() throws Exception {
		Book book = null;
		mFileInputStream = new FileInputStream(mBookFile);
		mObjectInputStream = new ObjectInputStream(mFileInputStream);

		// Read and return an object.
		book = (Book) mObjectInputStream.readObject();
		
		return book;
	}
	
}
