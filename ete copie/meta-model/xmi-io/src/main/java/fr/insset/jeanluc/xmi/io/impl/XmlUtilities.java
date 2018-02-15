/*
 * xmi-io project
 * This project is a module of the ete module of the global ete-toolchain project
 */
package fr.insset.jeanluc.xmi.io.impl;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author jldeleage
 */
public abstract class XmlUtilities {
    

    protected static NodeList getElementsByType(String inType, Node inSubTreeRoot) throws XPathExpressionException {
        String path = "//*[@*[local-name()='type']='" + inType + "']";
        NodeList result = getElements(path, inSubTreeRoot);
        return result;
    }




    protected static NodeList getElements(String inPath, Node inSubTreeRoot) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
        NodeList result = (NodeList)path.evaluate(inPath, inSubTreeRoot, XPathConstants.NODESET);
        return result;
    }


    protected static String getStringValue(String inPath, Node inSubTreeRoot) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
        String result = (String)path.evaluate(inPath, inSubTreeRoot, XPathConstants.STRING);
        return result;
    }

}
