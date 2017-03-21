@XmlSchema(
        elementFormDefault = XmlNsForm.QUALIFIED,
        namespace = "/super/type",
        xmlns={@XmlNs(
                prefix="st",
                namespaceURI="/super/type"
        )}
)
package org.springframework.data.marklogic.core.mapping.namespaceaware;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;