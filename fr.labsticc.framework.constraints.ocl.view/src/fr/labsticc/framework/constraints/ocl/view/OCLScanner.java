/*******************************************************************************
 * Copyright (c) 2011 Lab-STICC Universite de Bretagne Sud, Lorient.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B license available
 * at :
 * en : http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 * fr : http://www.cecill.info/licences/Licence_CeCILL-B_V1-fr.html
 * 
 * Contributors:
 * Dominique BLOUIN (Lab-STICC UBS), dominique.blouin@univ-ubs.fr
 ******************************************************************************/
package fr.labsticc.framework.constraints.ocl.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.NumberRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

import fr.labsticc.framework.constraints.view.ConstraintColorManager;
import fr.labsticc.framework.constraints.view.ConstraintWhitespaceDetector;

/**
 * Syntax-highlighting scanner for OCL expressions.
 * 
 */
class OCLScanner extends RuleBasedScanner {

    OCLScanner( final ConstraintColorManager p_manager ) {
        super();
        
        // Rules must be ordered properly
        final List<IRule> rules = new ArrayList<IRule>();
        
        final IToken literal = new Token( new TextAttribute( p_manager.getColor( ConstraintColorManager.LITERAL ) ) );

        // Add rule for strings
        rules.add( new SingleLineRule( "'", "'", literal ) );

        // Keyword (and pseudo-keyword) rule
        rules.add( new OCLKeywordRule() );
        
        // Collection and Tuple Literal rules
        rules.add( new OCLCollectionTupleRule( p_manager, false ) );
        rules.add( new OCLCollectionTupleRule( p_manager, true ) );

        // identifier rule
        rules.add( new OCLIdentifierRule() );

        // Add a rule for numbers
        rules.add(  new NumberRule( literal ) );
        
        // Add generic whitespace rule
        rules.add( new WhitespaceRule( new ConstraintWhitespaceDetector() ) );
        
        setRules( rules.toArray( new IRule[ rules.size() ] ) );
    }
}
