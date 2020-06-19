package org.ndx.agile.architecture.base.enhancers.tickets;

import java.util.Date;

public interface Comment {
	public Date getDate();
	/**
	 * @return Get comment text as asciidoc
	 */
	public String getText();
}
