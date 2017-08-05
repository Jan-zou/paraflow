package cn.edu.ruc.iir.paraflow.commons.exceptions;

/**
 * ParaFlow
 *
 * @author guodong
 */
public enum ParaFlowExceptionLevel
{
    FATAL("FATAL"),     // FATAL exception: system exit immediately
    ERROR("ERROR"),     // ERROR exception: log out and output it to stderr, system continues to run.
                  // This is for the situation where system can still continue to run though it may run abnormally.
    WARNING("WARNING"),   // WARN exception: log out and output it to stdout, system continues to run.
                  // This is for the situation where system can still run normally with this exception.
    DEBUG("DEBUG");      // DEBUG exception: output to stdout. this is for system test and debug.
                  // This kind of exceptions are NOT expected in the production environment.

    private final String name;

    ParaFlowExceptionLevel(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}