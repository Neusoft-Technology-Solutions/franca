/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.franca.tools.contracts.validator.search.regexp;

public abstract class CompoundElement extends RegexpElement {
	
	public RegexpElement[] elements;
	
	public CompoundElement(RegexpElement... elements) {
		this.elements = elements;
	}
	
	public RegexpElement[] getElements() {
		return elements;
	}
}
