/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.text.edits;

/**
 * Thrown to indicate that an edit got added to a parent edit
 * but the child edit somehow conflicts with the parent or
 * one of it siblings.
 * 
 * @see TextEdit#add(TextEdit)
 * 
 * @since 3.0
 */
public class MalformedTreeException extends RuntimeException {
	
	private TextEdit fParent;
	private TextEdit fChild;
	
	/** 
	 * Constructs a new malformed tree exception.
	 * 
	 * @param parent the parent edit
	 * @param child the child edit
	 * @param message the detail message
	 */
	public MalformedTreeException(TextEdit parent, TextEdit child, String message) {
		super(message);
		fParent= parent;
		fChild= child;
	}
	
	/**
	 * Returns the parent edit that caused the exception.
	 * 
	 * @return the parent edit
	 */
	public TextEdit getParent() {
		return fParent;
	}
	
	/**
	 * Returns the child edit that caused the exception.
	 * 
	 * @return the child edit
	 */
	public TextEdit getChild() {
		return fChild;
	}
	
	/* package */ void setParent(TextEdit parent) {
		fParent= parent;
	}
}