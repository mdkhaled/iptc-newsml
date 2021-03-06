
package gex.newsml.g2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * The type for a set of metadata properties including Administrative and core
 * Descriptive properties about the content
 * 
 * <p>
 * Java class for ContentMetadataAfDType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMetadataAfDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}icon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}AdministrativeMetadataGroup"/>
 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}DescriptiveMetadataGroup" minOccurs="0"/>
 *         &lt;element name="contentMetaExtProperty" type="{http://iptc.org/std/nar/2006-10-01/}Flex2ExtPropType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}i18nAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMetadataAfDType", propOrder = { "icon", "urgency", "contentCreated", "contentModified",
		"locatedOrInfoSourceOrCreator", "languageOrGenreOrKeyword", "contentMetaExtProperty", "any" })
@ToString
public class ContentMetadataAfDType {

	protected List<Icon> icon;
	protected Urgency urgency;
	protected TruncatedDateTimePropType contentCreated;
	protected TruncatedDateTimePropType contentModified;
	@XmlElementRefs({
			@XmlElementRef(name = "exclAudience", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "located", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "altId", namespace = "http://iptc.org/std/nar/2006-10-01/", type = AltId.class, required = false),
			@XmlElementRef(name = "infoSource", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "audience", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "contributor", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "userInteraction", namespace = "http://iptc.org/std/nar/2006-10-01/", type = UserInteraction.class, required = false),
			@XmlElementRef(name = "creator", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "rating", namespace = "http://iptc.org/std/nar/2006-10-01/", type = Rating.class, required = false) })
	protected List<Object> locatedOrInfoSourceOrCreator;
	@XmlElements({ @XmlElement(name = "language", type = Language.class),
			@XmlElement(name = "genre", type = Genre.class), @XmlElement(name = "keyword", type = Keyword.class),
			@XmlElement(name = "subject", type = Subject.class), @XmlElement(name = "slugline", type = Slugline.class),
			@XmlElement(name = "headline", type = Headline.class),
			@XmlElement(name = "dateline", type = Dateline.class), @XmlElement(name = "by", type = By.class),
			@XmlElement(name = "creditline", type = Creditline.class),
			@XmlElement(name = "description", type = Description.class) })
	protected List<Object> languageOrGenreOrKeyword;
	protected List<Flex2ExtPropType> contentMetaExtProperty;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAttribute(name = "creator")
	protected String creator;
	@XmlAttribute(name = "creatoruri")
	protected String creatoruri;
	@XmlAttribute(name = "modified")
	protected String modified;
	@XmlAttribute(name = "custom")
	protected Boolean custom;
	@XmlAttribute(name = "how")
	protected String how;
	@XmlAttribute(name = "howuri")
	protected String howuri;
	@XmlAttribute(name = "why")
	protected String why;
	@XmlAttribute(name = "whyuri")
	protected String whyuri;
	@XmlAttribute(name = "pubconstraint")
	protected List<String> pubconstraint;
	@XmlAttribute(name = "pubconstrainturi")
	protected List<String> pubconstrainturi;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;
	@XmlAttribute(name = "dir")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String dir;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the icon property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the icon property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIcon().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Icon }
	 * 
	 * 
	 */
	public List<Icon> getIcon() {
		if (icon == null) {
			icon = new ArrayList<Icon>();
		}
		return this.icon;
	}

	/**
	 * Gets the value of the urgency property.
	 * 
	 * @return possible object is {@link Urgency }
	 * 
	 */
	public Urgency getUrgency() {
		return urgency;
	}

	/**
	 * Sets the value of the urgency property.
	 * 
	 * @param value
	 *            allowed object is {@link Urgency }
	 * 
	 */
	public void setUrgency(Urgency value) {
		this.urgency = value;
	}

	/**
	 * Gets the value of the contentCreated property.
	 * 
	 * @return possible object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public TruncatedDateTimePropType getContentCreated() {
		return contentCreated;
	}

	/**
	 * Sets the value of the contentCreated property.
	 * 
	 * @param value
	 *            allowed object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public void setContentCreated(TruncatedDateTimePropType value) {
		this.contentCreated = value;
	}

	/**
	 * Gets the value of the contentModified property.
	 * 
	 * @return possible object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public TruncatedDateTimePropType getContentModified() {
		return contentModified;
	}

	/**
	 * Sets the value of the contentModified property.
	 * 
	 * @param value
	 *            allowed object is {@link TruncatedDateTimePropType }
	 * 
	 */
	public void setContentModified(TruncatedDateTimePropType value) {
		this.contentModified = value;
	}

	/**
	 * Gets the value of the locatedOrInfoSourceOrCreator property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the locatedOrInfoSourceOrCreator property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLocatedOrInfoSourceOrCreator().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link JAXBElement }{@code <}{@link AudienceType }{@code >}
	 * {@link JAXBElement }{@code <}{@link FlexLocationPropType }{@code >}
	 * {@link AltId } {@link JAXBElement }{@code <}{@link Flex1PartyPropType }
	 * {@code >} {@link JAXBElement }{@code <}{@link AudienceType }{@code >}
	 * {@link JAXBElement }{@code <}{@link FlexAuthorPropType }{@code >}
	 * {@link UserInteraction } {@link JAXBElement }{@code <}
	 * {@link FlexAuthorPropType }{@code >} {@link Rating }
	 * 
	 * 
	 */
	public List<Object> getLocatedOrInfoSourceOrCreator() {
		if (locatedOrInfoSourceOrCreator == null) {
			locatedOrInfoSourceOrCreator = new ArrayList<Object>();
		}
		return this.locatedOrInfoSourceOrCreator;
	}

	/**
	 * Gets the value of the languageOrGenreOrKeyword property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the languageOrGenreOrKeyword property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLanguageOrGenreOrKeyword().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Language
	 * } {@link Genre } {@link Keyword } {@link Subject } {@link Slugline }
	 * {@link Headline } {@link Dateline } {@link By } {@link Creditline }
	 * {@link Description }
	 * 
	 * 
	 */
	public List<Object> getLanguageOrGenreOrKeyword() {
		if (languageOrGenreOrKeyword == null) {
			languageOrGenreOrKeyword = new ArrayList<Object>();
		}
		return this.languageOrGenreOrKeyword;
	}

	/**
	 * Gets the value of the contentMetaExtProperty property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the contentMetaExtProperty property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getContentMetaExtProperty().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Flex2ExtPropType }
	 * 
	 * 
	 */
	public List<Flex2ExtPropType> getContentMetaExtProperty() {
		if (contentMetaExtProperty == null) {
			contentMetaExtProperty = new ArrayList<Flex2ExtPropType>();
		}
		return this.contentMetaExtProperty;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * {@link Element }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the creator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Sets the value of the creator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreator(String value) {
		this.creator = value;
	}

	/**
	 * Gets the value of the creatoruri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatoruri() {
		return creatoruri;
	}

	/**
	 * Sets the value of the creatoruri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatoruri(String value) {
		this.creatoruri = value;
	}

	/**
	 * Gets the value of the modified property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * Sets the value of the modified property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModified(String value) {
		this.modified = value;
	}

	/**
	 * Gets the value of the custom property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCustom() {
		return custom;
	}

	/**
	 * Sets the value of the custom property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCustom(Boolean value) {
		this.custom = value;
	}

	/**
	 * Gets the value of the how property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHow() {
		return how;
	}

	/**
	 * Sets the value of the how property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHow(String value) {
		this.how = value;
	}

	/**
	 * Gets the value of the howuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHowuri() {
		return howuri;
	}

	/**
	 * Sets the value of the howuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHowuri(String value) {
		this.howuri = value;
	}

	/**
	 * Gets the value of the why property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhy() {
		return why;
	}

	/**
	 * Sets the value of the why property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhy(String value) {
		this.why = value;
	}

	/**
	 * Gets the value of the whyuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhyuri() {
		return whyuri;
	}

	/**
	 * Sets the value of the whyuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhyuri(String value) {
		this.whyuri = value;
	}

	/**
	 * Gets the value of the pubconstraint property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstraint property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstraint().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPubconstraint() {
		if (pubconstraint == null) {
			pubconstraint = new ArrayList<String>();
		}
		return this.pubconstraint;
	}

	/**
	 * Gets the value of the pubconstrainturi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstrainturi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstrainturi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPubconstrainturi() {
		if (pubconstrainturi == null) {
			pubconstrainturi = new ArrayList<String>();
		}
		return this.pubconstrainturi;
	}

	/**
	 * Specifies the language of this property and potentially all descendant
	 * properties. xml:lang values of descendant properties override this value.
	 * Values are determined by Internet BCP 47.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		this.lang = value;
	}

	/**
	 * Gets the value of the dir property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDir() {
		return dir;
	}

	/**
	 * Sets the value of the dir property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDir(String value) {
		this.dir = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
