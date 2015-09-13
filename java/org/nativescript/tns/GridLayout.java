//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.12 às 11:28:18 PM BRT 
//


package org.nativescript.tns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GridLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GridLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attribute name="columns" type="{http://www.nativescript.org/tns.xsd}StringValidator" />
 *       &lt;attribute name="rows" type="{http://www.nativescript.org/tns.xsd}StringValidator" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridLayout")
public class GridLayout
    extends View
{

    @XmlAttribute(name = "columns")
    protected String columns;
    @XmlAttribute(name = "rows")
    protected String rows;

    /**
     * Obtém o valor da propriedade columns.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumns() {
        return columns;
    }

    /**
     * Define o valor da propriedade columns.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumns(String value) {
        this.columns = value;
    }

    /**
     * Obtém o valor da propriedade rows.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRows() {
        return rows;
    }

    /**
     * Define o valor da propriedade rows.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRows(String value) {
        this.rows = value;
    }

}
