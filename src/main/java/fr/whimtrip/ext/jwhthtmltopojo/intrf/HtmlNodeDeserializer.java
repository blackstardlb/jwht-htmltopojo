


package fr.whimtrip.ext.jwhthtmltopojo.intrf;

import fr.whimtrip.ext.jwhthtmltopojo.exception.ConversionException;
import fr.whimtrip.ext.jwhthtmltopojo.impl.ReplacerDeserializer;
import fr.whimtrip.ext.jwhthtmltopojo.impl.StringConcatenatorDeserializer;
import fr.whimtrip.ext.jwhthtmltopojo.impl.TextLengthSelectorDeserializer;
import org.jsoup.nodes.Element;

public interface HtmlNodeDeserializer<T> extends HtmlDeserializer<T> {
    T deserializePostConversion(String value, Element node) throws ConversionException;
}
