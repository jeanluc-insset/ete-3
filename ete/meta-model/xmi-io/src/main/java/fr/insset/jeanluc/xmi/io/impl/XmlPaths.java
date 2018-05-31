

package fr.insset.jeanluc.xmi.io.impl;

import static fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage.MOF_PACKAGE;

/**
 *
 * @author jldeleage
 */
public interface XmlPaths {

    public final static String     PRIMITIVE_TYPE_PATH     = "//packagedElement[@*='uml:PrimitiveType']";
    public final static String     PACKAGE_PATH            = "uml:Package";
    public final static String     CLASS_PATH              = "//*[@*='uml:Package']/*[@*='uml:Class']";
    public final static String     ENUM_PATH               = "//*[@*='uml:Package']/*[@*='uml:Enumeration']";
    public final static String     ASSOCIATION_PATH        = "uml:Association";
    public final static String     PROPERTY_PATH           = "uml:Property";
    public final static String     OPERATION_PATH          = "uml:Operation";
    public final static String     INSTANCE_PATH           = "uml:InstanceSpecification";
    public final static String     SLOT_PATH               = "//slot";
    public final static String     INVARIANT_PATH          = ".//packagedElement/ownedRule";
    public final static String     PRECONDITION_PATH       = ".//ownedOperation/ownedRule[@*=../precondition/@*]";
    public final static String     POSTCONDITION_PATH      = ".//ownedOperation/ownedRule[@*=../postcondition/@*]";
    public final static String     CONSTRAINT_PATH         = ".//ownedOperation/ownedRule";
    public final static String     PROFILE_PATH            = "uml:Profile";
    public final static String     PROFILE                 = MOF_PACKAGE;
    public final static String     STEREOTYPE_PATH         = "uml:Stereotype";
    public final static String     APPLIED_STEREOTYPE_PATH = ".//*[@base_Class]";
    public final static String     READER_VISITOR          = "reader_visitor";
    public final static String     XLIST                   = "xlist";


    public default String getPrimitiveTypePath() {
        return PRIMITIVE_TYPE_PATH;
    }


    public default String getPackagePath() {
        return PACKAGE_PATH;
    }

    public default String getClassPath() {
        return CLASS_PATH;
    }

    public default String getEnumPath() {
        return ENUM_PATH;
    }

    public default String getAssociationPath() {
        return ASSOCIATION_PATH;
    }

    public default String getPropertyPath() {
        return PROPERTY_PATH;
    }

    public default String getOperationPath() {
        return OPERATION_PATH;
    }

    public default String getInstancePath() {
        return INSTANCE_PATH;
    }

    public default String getSlotPath() {
        return SLOT_PATH;
    }

    public default String getInvariantPath() {
        return INVARIANT_PATH;
    }

    public default String getPreconditionPath() {
        return PRECONDITION_PATH;
    }

    public default String getPostconditionPath() {
        return POSTCONDITION_PATH;
    }

    public default String getConstraintPath() {
        return CONSTRAINT_PATH;
    }

    public default String getProfilePath() {
        return PROFILE_PATH;
    }

    public default String getStereotypePath() {
        return STEREOTYPE_PATH;
    }

    public default String getAppliedStereotypePath() {
        return APPLIED_STEREOTYPE_PATH;
    }


}
