package org.slf4j.impl;

import org.gmagnotta.log.LogEventCollector;
import org.gmagnotta.log.LogLevel;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

public class JELAdapter extends MarkerIgnoringBase {
	
	private static final long serialVersionUID = 1L;
	private org.gmagnotta.log.Logger logger;
	private LogEventCollector logEventCollector = LogEventCollector.getInstance();
	
	public JELAdapter(String name) {
		
		this.logger = org.gmagnotta.log.Logger.getLogger(name);
		
	}

	@Override
	public boolean isTraceEnabled() {
		
		return LogLevel.TRACE.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;
		
	}

	@Override
	public void trace(String msg) {
		logger.trace(msg);
	}

	@Override
	public void trace(String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);
		
		logger.trace(ft.getMessage());
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
		
		logger.trace(ft.getMessage());
		
	}

	@Override
	public void trace(String format, Object... arguments) {
		
		FormattingTuple ft = MessageFormatter.format(format, arguments);
		
		logger.trace(ft.getMessage());
		
	}

	@Override
	public void trace(String msg, Throwable t) {
		
		logger.trace(msg, t);
		
	}

	@Override
	public boolean isDebugEnabled() {
		
		return LogLevel.DEBUG.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;
		
	}

	@Override
	public void debug(String msg) {
		logger.debug(msg);
	}

	@Override
	public void debug(String format, Object arg) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg);
		
		logger.debug(ft.getMessage());
		
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
		
		logger.debug(ft.getMessage());
		
	}

	@Override
	public void debug(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.format(format, arguments);
		
		logger.debug(ft.getMessage());
		
	}

	@Override
	public void debug(String msg, Throwable t) {

		logger.debug(msg, t);
		
	}

	@Override
	public boolean isInfoEnabled() {
		
		return LogLevel.INFO.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;
		
	}

	@Override
	public void info(String msg) {
		
		logger.info(msg);
		
	}

	@Override
	public void info(String format, Object arg) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg);
		
		logger.info(ft.getMessage());
		
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {

		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
		
		logger.info(ft.getMessage());
		
	}

	@Override
	public void info(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.format(format, arguments);
		
		logger.info(ft.getMessage());
		
	}

	@Override
	public void info(String msg, Throwable t) {

		logger.info(msg, t);
		
	}

	@Override
	public boolean isWarnEnabled() {
		
		return LogLevel.WARNING.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;
		
	}

	@Override
	public void warn(String msg) {
		logger.warning(msg);
	}

	@Override
	public void warn(String format, Object arg) {

		FormattingTuple ft = MessageFormatter.format(format, arg);
		
		logger.warning(ft.getMessage());
		
	}

	@Override
	public void warn(String format, Object... arguments) {

		FormattingTuple ft = MessageFormatter.format(format, arguments);
		
		logger.warning(ft.getMessage());
		
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {

		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
		
		logger.warning(ft.getMessage());
		
	}

	@Override
	public void warn(String msg, Throwable t) {
		
		logger.warning(msg, t);
		
	}

	@Override
	public boolean isErrorEnabled() {
		
		return LogLevel.ERROR.compareTo(logEventCollector.getLogLevelThreshold()) >= 0;
		
	}

	@Override
	public void error(String msg) {
		
		logger.error(msg);
		
	}

	@Override
	public void error(String format, Object arg) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg);
		
		logger.error(ft.getMessage());
		
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		
		FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
		
		logger.error(ft.getMessage());
		
	}

	@Override
	public void error(String format, Object... arguments) {
		
		FormattingTuple ft = MessageFormatter.format(format, arguments);
		
		logger.error(ft.getMessage());
		
	}

	@Override
	public void error(String msg, Throwable t) {

		logger.error(msg, t);
		
	}

}
