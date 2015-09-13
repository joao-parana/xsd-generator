//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.12 às 11:28:18 PM BRT 
//


package org.nativescript.tns;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Layout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Layout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.nativescript.org/tns.xsd}UIComponents" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}layoutAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layout", propOrder = {
    "uiComponents"
})
@XmlSeeAlso({
    WrapLayout.class,
    StackLayout.class,
    DockLayout.class,
    AbsoluteLayout.class
})
public class Layout
    extends View
{

    @XmlElements({
        @XmlElement(name = "Label", type = Label.class),
        @XmlElement(name = "Button", type = Button.class),
        @XmlElement(name = "TabView", type = TabView.class),
        @XmlElement(name = "Border", type = Border.class),
        @XmlElement(name = "Image", type = Image.class),
        @XmlElement(name = "ScrollView", type = ScrollView.class),
        @XmlElement(name = "Progress", type = Progress.class),
        @XmlElement(name = "StackLayout", type = StackLayout.class),
        @XmlElement(name = "WrapLayout", type = WrapLayout.class),
        @XmlElement(name = "GridLayout", type = GridLayout.class),
        @XmlElement(name = "AbsoluteLayout", type = AbsoluteLayout.class),
        @XmlElement(name = "ActivityIndicator", type = ActivityIndicator.class),
        @XmlElement(name = "Slider", type = Slider.class),
        @XmlElement(name = "Switch", type = Switch.class),
        @XmlElement(name = "WebView", type = WebView.class),
        @XmlElement(name = "TextView", type = TextView.class),
        @XmlElement(name = "TextField", type = TextField.class),
        @XmlElement(name = "ListView", type = ListView.class)
    })
    protected List<View> uiComponents;

    /**
     * Gets the value of the uiComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUIComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * {@link Button }
     * {@link TabView }
     * {@link Border }
     * {@link Image }
     * {@link ScrollView }
     * {@link Progress }
     * {@link StackLayout }
     * {@link WrapLayout }
     * {@link GridLayout }
     * {@link AbsoluteLayout }
     * {@link ActivityIndicator }
     * {@link Slider }
     * {@link Switch }
     * {@link WebView }
     * {@link TextView }
     * {@link TextField }
     * {@link ListView }
     * 
     * 
     */
    public List<View> getUIComponents() {
        if (uiComponents == null) {
            uiComponents = new ArrayList<View>();
        }
        return this.uiComponents;
    }

}
