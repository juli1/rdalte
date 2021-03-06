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
package fr.openpeople.rdal.model.core.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import fr.openpeople.rdal.model.core.diagram.edit.policies.ContractualElementStakeHoldersItemSemanticEditPolicy;

/**
 * @generated
 */
public class ContractualElementStakeHoldersEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4020;

	/**
	 * @generated
	 */
	public ContractualElementStakeHoldersEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContractualElementStakeHoldersItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new RequirementsStakeHoldersLink();
	}

	/**
	 * @generated
	 */
	public RequirementsStakeHoldersLink getPrimaryShape() {
		return (RequirementsStakeHoldersLink) getFigure();
	}

	/**
	 * @generated
	 */
	public class RequirementsStakeHoldersLink extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RequirementsStakeHoldersLink() {
			this.setFillXOR(true);
			this.setBackgroundColor(THIS_BACK);

			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setForegroundColor(DF_FORE);
			df.setBackgroundColor(DF_BACK);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(6));
			pl.addPoint(getMapMode().DPtoLP(3), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(4), getMapMode().DPtoLP(3));
			pl.addPoint(getMapMode().DPtoLP(6), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(6), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(6), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(4), getMapMode().DPtoLP(-3));
			pl.addPoint(getMapMode().DPtoLP(3), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(3), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(3), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(3), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(-6));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(-6));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-6));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(-4), getMapMode().DPtoLP(-3));
			pl.addPoint(getMapMode().DPtoLP(-6), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(-6), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-6), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(-4), getMapMode().DPtoLP(3));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(6));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(6));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(6));
			df.setTemplate(pl);
			// DB: Causes too big ends
			df.setScale(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1));
			//df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color DF_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color DF_BACK = new Color(null, 255, 255, 255);

}
