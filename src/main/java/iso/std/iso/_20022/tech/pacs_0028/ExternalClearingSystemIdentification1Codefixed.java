package iso.std.iso._20022.tech.pacs_0028;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalClearingSystemIdentification1Code_fixed")
@XmlEnum
public enum ExternalClearingSystemIdentification1Codefixed {

    USABA;

    public String value() {
        return name();
    }

    public static ExternalClearingSystemIdentification1Codefixed fromValue(String v) {
        return valueOf(v);
    }


}
