package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFormattedTextField.AbstractFormatter;

/**
 * The Class DateLabelFormatter.
 */
public class DateLabelFormatter extends AbstractFormatter
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The date pattern. */
	private String datePattern = "yyyy-MM-dd";

	/** The date formatter. */
	private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

	@Override
	public Object stringToValue(String text) throws ParseException
	{
		return dateFormatter.parseObject(text);
	}

	@Override
	public String valueToString(Object value) throws ParseException
	{
		if (value != null)
		{
			Calendar cal = (Calendar) value;
			return dateFormatter.format(cal.getTime());
		}

		return "";
	}

}