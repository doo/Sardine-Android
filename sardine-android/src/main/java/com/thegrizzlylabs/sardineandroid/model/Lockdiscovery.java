//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/27/2009 06:09 PM(mockbuild)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.23 at 06:27:19 PM PST 
//


package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.</p>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{DAV:}activelock"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Root
@Namespace(prefix = "D", reference = "DAV:")
public class Lockdiscovery {

    @ElementList(inline = true, required = false)
    private List<Activelock> activelock;

    /**
     * Gets the value of the activelock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activelock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivelock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activelock }
     * 
     * 
     */
    public List<Activelock> getActivelock() {
        if (activelock == null) {
            activelock = new ArrayList<Activelock>();
        }
        return this.activelock;
    }

}
