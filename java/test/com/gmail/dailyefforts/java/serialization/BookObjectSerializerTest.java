package com.gmail.dailyefforts.java.serialization;

import java.io.File;

import org.vhow.java.serialization.Book;
import org.vhow.java.serialization.BookObjectSerializer;

import junit.framework.TestCase;

public class BookObjectSerializerTest extends TestCase {
	private BookObjectSerializer mBookObjectSerializer;

	protected void setUp() throws Exception {
		super.setUp();
		mBookObjectSerializer = new BookObjectSerializer();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.gc();
	}

	public void testWriteBookObject() {
		try {
			File file = mBookObjectSerializer.writeObject();
			assertEquals(true, file.exists());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testReadBookObject() {
		try {
			Book book = mBookObjectSerializer.getBookObject();
			assertEquals(book.getName(), mBookObjectSerializer.readObject().getName());
			assertEquals(book.getPrice(), mBookObjectSerializer.readObject().getPrice());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
