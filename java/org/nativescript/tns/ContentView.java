//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.12 às 11:28:18 PM BRT 
//


package org.nativescript.tns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContentView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContentView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.nativescript.org/tns.xsd}UIComponents"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}contentViewAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentView", propOrder = {
    "label",
    "button",
    "tabView",
    "border",
    "image",
    "scrollView",
    "progress",
    "stackLayout",
    "wrapLayout",
    "gridLayout",
    "absoluteLayout",
    "activityIndicator",
    "slider",
    "_switch",
    "webView",
    "textView",
    "textField",
    "listView"
})
@XmlSeeAlso({
    Page.class,
    ScrollView.class,
    Border.class
})
public class ContentView
    extends View
{

    @XmlElement(name = "Label")
    protected Label label;
    @XmlElement(name = "Button")
    protected Button button;
    @XmlElement(name = "TabView")
    protected TabView tabView;
    @XmlElement(name = "Border")
    protected Border border;
    @XmlElement(name = "Image")
    protected Image image;
    @XmlElement(name = "ScrollView")
    protected ScrollView scrollView;
    @XmlElement(name = "Progress")
    protected Progress progress;
    @XmlElement(name = "StackLayout")
    protected StackLayout stackLayout;
    @XmlElement(name = "WrapLayout")
    protected WrapLayout wrapLayout;
    @XmlElement(name = "GridLayout")
    protected GridLayout gridLayout;
    @XmlElement(name = "AbsoluteLayout")
    protected AbsoluteLayout absoluteLayout;
    @XmlElement(name = "ActivityIndicator")
    protected ActivityIndicator activityIndicator;
    @XmlElement(name = "Slider")
    protected Slider slider;
    @XmlElement(name = "Switch")
    protected Switch _switch;
    @XmlElement(name = "WebView")
    protected WebView webView;
    @XmlElement(name = "TextView")
    protected TextView textView;
    @XmlElement(name = "TextField")
    protected TextField textField;
    @XmlElement(name = "ListView")
    protected ListView listView;

    /**
     * Obtém o valor da propriedade label.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Define o valor da propriedade label.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Obtém o valor da propriedade button.
     * 
     * @return
     *     possible object is
     *     {@link Button }
     *     
     */
    public Button getButton() {
        return button;
    }

    /**
     * Define o valor da propriedade button.
     * 
     * @param value
     *     allowed object is
     *     {@link Button }
     *     
     */
    public void setButton(Button value) {
        this.button = value;
    }

    /**
     * Obtém o valor da propriedade tabView.
     * 
     * @return
     *     possible object is
     *     {@link TabView }
     *     
     */
    public TabView getTabView() {
        return tabView;
    }

    /**
     * Define o valor da propriedade tabView.
     * 
     * @param value
     *     allowed object is
     *     {@link TabView }
     *     
     */
    public void setTabView(TabView value) {
        this.tabView = value;
    }

    /**
     * Obtém o valor da propriedade border.
     * 
     * @return
     *     possible object is
     *     {@link Border }
     *     
     */
    public Border getBorder() {
        return border;
    }

    /**
     * Define o valor da propriedade border.
     * 
     * @param value
     *     allowed object is
     *     {@link Border }
     *     
     */
    public void setBorder(Border value) {
        this.border = value;
    }

    /**
     * Obtém o valor da propriedade image.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Define o valor da propriedade image.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Obtém o valor da propriedade scrollView.
     * 
     * @return
     *     possible object is
     *     {@link ScrollView }
     *     
     */
    public ScrollView getScrollView() {
        return scrollView;
    }

    /**
     * Define o valor da propriedade scrollView.
     * 
     * @param value
     *     allowed object is
     *     {@link ScrollView }
     *     
     */
    public void setScrollView(ScrollView value) {
        this.scrollView = value;
    }

    /**
     * Obtém o valor da propriedade progress.
     * 
     * @return
     *     possible object is
     *     {@link Progress }
     *     
     */
    public Progress getProgress() {
        return progress;
    }

    /**
     * Define o valor da propriedade progress.
     * 
     * @param value
     *     allowed object is
     *     {@link Progress }
     *     
     */
    public void setProgress(Progress value) {
        this.progress = value;
    }

    /**
     * Obtém o valor da propriedade stackLayout.
     * 
     * @return
     *     possible object is
     *     {@link StackLayout }
     *     
     */
    public StackLayout getStackLayout() {
        return stackLayout;
    }

    /**
     * Define o valor da propriedade stackLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link StackLayout }
     *     
     */
    public void setStackLayout(StackLayout value) {
        this.stackLayout = value;
    }

    /**
     * Obtém o valor da propriedade wrapLayout.
     * 
     * @return
     *     possible object is
     *     {@link WrapLayout }
     *     
     */
    public WrapLayout getWrapLayout() {
        return wrapLayout;
    }

    /**
     * Define o valor da propriedade wrapLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link WrapLayout }
     *     
     */
    public void setWrapLayout(WrapLayout value) {
        this.wrapLayout = value;
    }

    /**
     * Obtém o valor da propriedade gridLayout.
     * 
     * @return
     *     possible object is
     *     {@link GridLayout }
     *     
     */
    public GridLayout getGridLayout() {
        return gridLayout;
    }

    /**
     * Define o valor da propriedade gridLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link GridLayout }
     *     
     */
    public void setGridLayout(GridLayout value) {
        this.gridLayout = value;
    }

    /**
     * Obtém o valor da propriedade absoluteLayout.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteLayout }
     *     
     */
    public AbsoluteLayout getAbsoluteLayout() {
        return absoluteLayout;
    }

    /**
     * Define o valor da propriedade absoluteLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteLayout }
     *     
     */
    public void setAbsoluteLayout(AbsoluteLayout value) {
        this.absoluteLayout = value;
    }

    /**
     * Obtém o valor da propriedade activityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ActivityIndicator }
     *     
     */
    public ActivityIndicator getActivityIndicator() {
        return activityIndicator;
    }

    /**
     * Define o valor da propriedade activityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityIndicator }
     *     
     */
    public void setActivityIndicator(ActivityIndicator value) {
        this.activityIndicator = value;
    }

    /**
     * Obtém o valor da propriedade slider.
     * 
     * @return
     *     possible object is
     *     {@link Slider }
     *     
     */
    public Slider getSlider() {
        return slider;
    }

    /**
     * Define o valor da propriedade slider.
     * 
     * @param value
     *     allowed object is
     *     {@link Slider }
     *     
     */
    public void setSlider(Slider value) {
        this.slider = value;
    }

    /**
     * Obtém o valor da propriedade switch.
     * 
     * @return
     *     possible object is
     *     {@link Switch }
     *     
     */
    public Switch getSwitch() {
        return _switch;
    }

    /**
     * Define o valor da propriedade switch.
     * 
     * @param value
     *     allowed object is
     *     {@link Switch }
     *     
     */
    public void setSwitch(Switch value) {
        this._switch = value;
    }

    /**
     * Obtém o valor da propriedade webView.
     * 
     * @return
     *     possible object is
     *     {@link WebView }
     *     
     */
    public WebView getWebView() {
        return webView;
    }

    /**
     * Define o valor da propriedade webView.
     * 
     * @param value
     *     allowed object is
     *     {@link WebView }
     *     
     */
    public void setWebView(WebView value) {
        this.webView = value;
    }

    /**
     * Obtém o valor da propriedade textView.
     * 
     * @return
     *     possible object is
     *     {@link TextView }
     *     
     */
    public TextView getTextView() {
        return textView;
    }

    /**
     * Define o valor da propriedade textView.
     * 
     * @param value
     *     allowed object is
     *     {@link TextView }
     *     
     */
    public void setTextView(TextView value) {
        this.textView = value;
    }

    /**
     * Obtém o valor da propriedade textField.
     * 
     * @return
     *     possible object is
     *     {@link TextField }
     *     
     */
    public TextField getTextField() {
        return textField;
    }

    /**
     * Define o valor da propriedade textField.
     * 
     * @param value
     *     allowed object is
     *     {@link TextField }
     *     
     */
    public void setTextField(TextField value) {
        this.textField = value;
    }

    /**
     * Obtém o valor da propriedade listView.
     * 
     * @return
     *     possible object is
     *     {@link ListView }
     *     
     */
    public ListView getListView() {
        return listView;
    }

    /**
     * Define o valor da propriedade listView.
     * 
     * @param value
     *     allowed object is
     *     {@link ListView }
     *     
     */
    public void setListView(ListView value) {
        this.listView = value;
    }

}
