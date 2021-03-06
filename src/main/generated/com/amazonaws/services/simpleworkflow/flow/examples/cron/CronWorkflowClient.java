/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.cron;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflow}. 
 * Used to invoke child workflows asynchronously from parent workflow code.
 * Created through {@link CronWorkflowClientFactory#getClient}.
 * <p>
 * When running outside of the scope of a workflow use {@link CronWorkflowClientExternal} instead.
 */
public interface CronWorkflowClient extends WorkflowClient
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflow#startCron}
     */
    Promise<Void> startCron(com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowOptions options);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflow#startCron}
     */
    Promise<Void> startCron(com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowOptions options, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflow#startCron}
     */
    Promise<Void> startCron(com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowOptions options, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflow#startCron}
     */
    Promise<Void> startCron(Promise<com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowOptions> options);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflow#startCron}
     */
    Promise<Void> startCron(Promise<com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowOptions> options, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflow#startCron}
     */
    Promise<Void> startCron(Promise<com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowOptions> options, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

}