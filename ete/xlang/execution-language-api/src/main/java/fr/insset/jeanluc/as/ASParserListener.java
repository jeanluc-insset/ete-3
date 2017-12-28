// Generated from fr/insset/jeanluc/as/ASParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.as;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASParser}.
 */
public interface ASParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ASParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ASParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ASParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ASParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ASParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ASParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(ASParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(ASParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(ASParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(ASParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(ASParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(ASParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ASParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ASParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ASParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ASParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(ASParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(ASParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(ASParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(ASParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(ASParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(ASParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(ASParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(ASParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(ASParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(ASParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(ASParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(ASParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(ASParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(ASParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ASParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ASParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(ASParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(ASParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ASParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ASParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(ASParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(ASParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(ASParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(ASParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(ASParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(ASParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ASParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ASParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(ASParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(ASParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ASParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ASParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(ASParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(ASParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(ASParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(ASParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(ASParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(ASParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ASParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ASParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(ASParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(ASParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(ASParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(ASParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ASParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ASParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(ASParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(ASParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ASParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ASParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ASParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ASParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(ASParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(ASParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ASParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ASParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(ASParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(ASParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(ASParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(ASParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(ASParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(ASParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(ASParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(ASParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ASParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ASParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ASParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ASParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(ASParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(ASParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(ASParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(ASParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ASParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ASParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(ASParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(ASParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(ASParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(ASParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(ASParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(ASParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(ASParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(ASParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ASParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ASParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ASParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ASParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(ASParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(ASParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ASParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ASParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(ASParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(ASParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(ASParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(ASParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ASParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ASParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ASParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ASParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ASParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ASParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(ASParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(ASParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(ASParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(ASParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(ASParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(ASParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(ASParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(ASParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(ASParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(ASParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(ASParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(ASParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(ASParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(ASParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(ASParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(ASParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(ASParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(ASParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(ASParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(ASParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(ASParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(ASParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(ASParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(ASParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ASParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ASParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(ASParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(ASParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(ASParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(ASParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(ASParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(ASParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(ASParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(ASParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ASParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ASParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ASParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ASParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ASParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ASParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(ASParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(ASParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ASParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ASParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(ASParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(ASParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(ASParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(ASParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(ASParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(ASParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(ASParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(ASParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ASParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ASParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(ASParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(ASParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(ASParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(ASParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ASParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ASParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(ASParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(ASParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(ASParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(ASParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(ASParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(ASParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(ASParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(ASParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(ASParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(ASParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ASParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ASParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(ASParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(ASParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(ASParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(ASParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(ASParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(ASParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(ASParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(ASParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(ASParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(ASParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ASParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ASParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(ASParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(ASParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(ASParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(ASParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(ASParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(ASParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(ASParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(ASParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(ASParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(ASParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(ASParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(ASParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(ASParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(ASParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(ASParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(ASParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(ASParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(ASParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(ASParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(ASParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(ASParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(ASParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(ASParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(ASParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(ASParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(ASParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(ASParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(ASParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(ASParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(ASParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ASParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ASParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(ASParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(ASParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(ASParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(ASParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(ASParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(ASParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(ASParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(ASParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(ASParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(ASParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(ASParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(ASParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(ASParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(ASParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(ASParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(ASParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ASParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ASParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(ASParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(ASParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ASParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ASParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ASParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ASParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ASParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ASParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ASParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ASParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ASParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ASParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ASParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ASParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(ASParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(ASParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(ASParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(ASParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(ASParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(ASParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(ASParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(ASParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(ASParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(ASParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ASParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ASParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ASParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ASParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(ASParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(ASParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(ASParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(ASParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(ASParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(ASParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(ASParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(ASParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ASParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ASParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ASParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ASParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(ASParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(ASParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(ASParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(ASParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(ASParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(ASParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(ASParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(ASParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ASParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ASParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(ASParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(ASParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ASParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ASParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ASParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ASParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(ASParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(ASParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(ASParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(ASParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(ASParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(ASParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ASParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ASParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ASParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ASParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(ASParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(ASParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(ASParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(ASParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(ASParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(ASParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ASParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ASParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ASParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ASParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ASParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ASParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ASParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ASParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(ASParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(ASParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ASParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ASParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(ASParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(ASParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ASParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ASParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(ASParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(ASParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(ASParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(ASParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(ASParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(ASParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(ASParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(ASParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(ASParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(ASParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(ASParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(ASParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ASParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ASParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ASParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ASParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(ASParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(ASParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(ASParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(ASParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(ASParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(ASParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(ASParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(ASParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ASParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ASParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ASParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ASParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(ASParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(ASParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(ASParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(ASParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(ASParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(ASParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(ASParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(ASParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(ASParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(ASParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(ASParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(ASParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(ASParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(ASParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ASParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ASParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(ASParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(ASParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(ASParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(ASParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(ASParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(ASParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(ASParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(ASParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(ASParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(ASParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ASParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ASParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(ASParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(ASParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(ASParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(ASParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(ASParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(ASParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(ASParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(ASParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(ASParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(ASParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(ASParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(ASParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ASParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ASParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ASParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ASParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(ASParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(ASParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(ASParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(ASParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(ASParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(ASParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(ASParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(ASParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ASParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ASParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ASParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ASParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(ASParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(ASParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ASParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ASParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ASParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ASParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(ASParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(ASParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(ASParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(ASParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ASParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ASParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ASParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ASParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ASParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ASParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ASParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ASParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ASParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ASParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ASParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ASParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ASParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ASParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ASParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ASParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ASParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ASParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ASParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ASParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(ASParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(ASParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(ASParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(ASParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ASParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ASParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ASParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ASParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(ASParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(ASParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(ASParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(ASParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(ASParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(ASParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ASParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ASParser.CastExpressionContext ctx);
}