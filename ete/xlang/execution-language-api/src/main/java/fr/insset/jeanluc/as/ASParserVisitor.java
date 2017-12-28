// Generated from fr/insset/jeanluc/as/ASParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.as;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ASParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ASParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ASParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ASParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ASParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ASParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(ASParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(ASParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(ASParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(ASParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(ASParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(ASParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(ASParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(ASParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(ASParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(ASParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(ASParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(ASParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(ASParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(ASParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ASParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(ASParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ASParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(ASParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ASParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(ASParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ASParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(ASParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(ASParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(ASParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ASParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(ASParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(ASParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(ASParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(ASParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ASParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(ASParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(ASParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ASParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(ASParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(ASParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(ASParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(ASParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ASParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ASParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(ASParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(ASParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ASParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(ASParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(ASParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(ASParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(ASParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ASParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ASParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(ASParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ASParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(ASParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(ASParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ASParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ASParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ASParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(ASParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(ASParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(ASParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(ASParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(ASParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(ASParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(ASParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(ASParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(ASParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(ASParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(ASParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(ASParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ASParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(ASParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(ASParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(ASParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(ASParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ASParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ASParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ASParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(ASParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(ASParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(ASParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(ASParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(ASParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(ASParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ASParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(ASParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(ASParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ASParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(ASParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(ASParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(ASParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(ASParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(ASParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ASParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(ASParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(ASParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(ASParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(ASParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(ASParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(ASParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(ASParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(ASParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(ASParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(ASParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(ASParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(ASParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(ASParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(ASParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(ASParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(ASParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(ASParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(ASParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(ASParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(ASParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(ASParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ASParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(ASParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(ASParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(ASParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(ASParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(ASParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(ASParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(ASParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(ASParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ASParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(ASParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ASParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(ASParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ASParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(ASParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ASParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ASParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(ASParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(ASParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(ASParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(ASParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(ASParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ASParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(ASParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(ASParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(ASParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(ASParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(ASParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ASParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(ASParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(ASParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(ASParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(ASParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(ASParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ASParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(ASParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(ASParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ASParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(ASParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(ASParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(ASParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ASParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(ASParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(ASParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(ASParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(ASParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ASParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ASParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ASParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ASParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(ASParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(ASParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(ASParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(ASParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(ASParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(ASParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(ASParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(ASParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(ASParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(ASParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(ASParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ASParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(ASParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(ASParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(ASParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(ASParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ASParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ASParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ASParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(ASParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(ASParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(ASParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(ASParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(ASParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(ASParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(ASParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(ASParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(ASParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(ASParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(ASParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(ASParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(ASParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ASParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(ASParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(ASParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(ASParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(ASParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(ASParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(ASParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(ASParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ASParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(ASParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(ASParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(ASParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(ASParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ASParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ASParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(ASParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ASParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(ASParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(ASParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(ASParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(ASParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(ASParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ASParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ASParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ASParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(ASParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ASParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ASParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ASParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(ASParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(ASParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(ASParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(ASParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(ASParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(ASParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(ASParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(ASParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ASParser.CastExpressionContext ctx);
}