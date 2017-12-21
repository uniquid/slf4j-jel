package org.slf4j.impl;

import java.io.Serializable;

import org.gmagnotta.log.LogEventCollector;
import org.gmagnotta.log.LogLevel;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class JELAdapter implements Logger, Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private org.gmagnotta.log.Logger logger;
	private LogEventCollector logEventCollector = LogEventCollector.getInstance();

	public JELAdapter(String name) {

		this.name = name;
		this.logger = org.gmagnotta.log.Logger.getLogger(name);

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		return isTraceEnabled();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "(" + getName() + ")";
	}
	
	@Override
	public boolean isTraceEnabled() {

		return LogLevel.TRACE.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;

	}

	@Override
	public void trace(Marker marker, String msg) {
		logger.trace(marker.getName(), msg);
	}
	
	@Override
	public void trace(String msg) {
		logger.trace(msg);
	}

	@Override
	public void trace(Marker marker, String format, Object arg) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.trace(marker.getName(), ft.getMessage());
		
	}
	
	@Override
	public void trace(String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.trace(ft.getMessage());
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.trace(marker.getName(), ft.getMessage());
		
	}
	
	@Override
	public void trace(String format, Object arg1, Object arg2) {

		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.trace(ft.getMessage());

	}
	
	@Override
	public void trace(Marker marker, String format, Object... arguments) {
		
		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.trace(marker.getName(), ft.getMessage());
		
	}

	@Override
	public void trace(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.trace(ft.getMessage());

	}
	
	@Override
	public void trace(Marker marker, String msg, Throwable t) {
		
		logger.trace(marker.getName(), msg, t);
		
	}

	@Override
	public void trace(String msg, Throwable t) {

		logger.trace(msg, t);

	}
	
	@Override
	public boolean isDebugEnabled(Marker marker) {
		return isDebugEnabled();
	}

	@Override
	public boolean isDebugEnabled() {

		return LogLevel.DEBUG.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;

	}

	@Override
	public void debug(Marker marker, String msg) {
		logger.debug(marker.getName(), msg);
	}
	
	@Override
	public void debug(String msg) {
		logger.debug(msg);
	}

	@Override
	public void debug(Marker marker, String format, Object arg) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.debug(marker.getName(), ft.getMessage());
	}
	
	@Override
	public void debug(String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.debug(ft.getMessage());

	}
	
	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.debug(marker.getName(), ft.getMessage());
		
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {

		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.debug(ft.getMessage());

	}

	@Override
	public void debug(Marker marker, String format, Object... arguments) {
		
		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.debug(marker.getName(), ft.getMessage());
		
	}
	

	@Override
	public void debug(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.debug(ft.getMessage());

	}

	@Override
	public void debug(Marker marker, String msg, Throwable t) {
		
		logger.debug(marker.getName(), msg, t);
		
	}

	@Override
	public void debug(String msg, Throwable t) {

		logger.debug(msg, t);

	}
	
	@Override
	public boolean isInfoEnabled(Marker marker) {
		return isInfoEnabled();
	}

	@Override
	public boolean isInfoEnabled() {

		return LogLevel.INFO.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;

	}
	
	@Override
	public void info(Marker marker, String msg) {

		logger.info(marker.getName(), msg);

	}

	@Override
	public void info(String msg) {

		logger.info(msg);

	}

	@Override
	public void info(Marker marker, String format, Object arg) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.info(marker.getName(), ft.getMessage());
		
	}

	@Override
	public void info(String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.info(ft.getMessage());

	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.info(marker.getName(), ft.getMessage());
		
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {

		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.info(ft.getMessage());

	}

	@Override
	public void info(Marker marker, String format, Object... arguments) {
		
		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.info(marker.getName(), ft.getMessage());
		
	}

	@Override
	public void info(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.info(ft.getMessage());

	}

	@Override
	public void info(Marker marker, String msg, Throwable t) {
		
		logger.info(marker.getName(), msg, t);
		
	}

	@Override
	public void info(String msg, Throwable t) {

		logger.info(msg, t);

	}
	
	@Override
	public boolean isWarnEnabled(Marker marker) {
		return isWarnEnabled();
	}

	@Override
	public boolean isWarnEnabled() {

		return LogLevel.WARNING.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;

	}
	
	@Override
	public void warn(Marker marker, String msg) {
		
		logger.warning(marker.getName(), msg);
		
	}

	@Override
	public void warn(String msg) {
		logger.warning(msg);
	}

	@Override
	public void warn(Marker marker, String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.warning(marker.getName(), ft.getMessage());

	}

	@Override
	public void warn(String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.warning(ft.getMessage());

	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2) {

		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
		
		logger.warning(marker.getName(), ft.getMessage());
		
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
		
		logger.warning(ft.getMessage());
		
	}

	@Override
	public void warn(Marker marker, String format, Object... arguments) {
		
		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.warning(marker.getName(), ft.getMessage());
		
	}
	
	@Override
	public void warn(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.warning(ft.getMessage());

	}
	
	@Override
	public void warn(Marker marker, String msg, Throwable t) {
		
		logger.warning(marker.getName(), msg, t);
		
	}


	@Override
	public void warn(String msg, Throwable t) {

		logger.warning(msg, t);

	}
	
	@Override
	public boolean isErrorEnabled(Marker marker) {
		return isErrorEnabled();
	}

	@Override
	public boolean isErrorEnabled() {

		return LogLevel.ERROR.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;

	}

	@Override
	public void error(Marker marker, String msg) {
		
		logger.error(marker.getName(), msg);
		
	}
	
	@Override
	public void error(String msg) {

		logger.error(msg);

	}

	@Override
	public void error(Marker marker, String format, Object arg) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.error(marker.getName(), ft.getMessage());
		
	}
	
	@Override
	public void error(String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);

		logger.error(ft.getMessage());

	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.error(marker.getName(), ft.getMessage());
	}
	

	@Override
	public void error(String format, Object arg1, Object arg2) {

		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);

		logger.error(ft.getMessage());

	}

	@Override
	public void error(Marker marker, String format, Object... arguments) {
		
		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.error(marker.getName(), ft.getMessage());
		
	}
	

	@Override
	public void error(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

		logger.error(ft.getMessage());

	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		
		logger.error(marker.getName(), msg, t);
		
	}

	@Override
	public void error(String msg, Throwable t) {

		logger.error(msg, t);

	}

}
