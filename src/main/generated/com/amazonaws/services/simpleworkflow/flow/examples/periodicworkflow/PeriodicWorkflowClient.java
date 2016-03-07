/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflow}. 
 * Used to invoke child workflows asynchronously from parent workflow code.
 * Created through {@link PeriodicWorkflowClientFactory#getClient}.
 * <p>
 * When running outside of the scope of a workflow use {@link PeriodicWorkflowClientExternal} instead.
 */
public interface PeriodicWorkflowClient extends WorkflowClient
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflow#startPeriodicWorkflow}
     */
    Promise<Void> startPeriodicWorkflow(com.amazonaws.services.simpleworkflow.model.ActivityType activity, Object[] activityArguments, com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflowOptions options);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflow#startPeriodicWorkflow}
     */
    Promise<Void> startPeriodicWorkflow(com.amazonaws.services.simpleworkflow.model.ActivityType activity, Object[] activityArguments, com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflowOptions options, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflow#startPeriodicWorkflow}
     */
    Promise<Void> startPeriodicWorkflow(com.amazonaws.services.simpleworkflow.model.ActivityType activity, Object[] activityArguments, com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflowOptions options, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflow#startPeriodicWorkflow}
     */
    Promise<Void> startPeriodicWorkflow(Promise<com.amazonaws.services.simpleworkflow.model.ActivityType> activity, Promise<Object[]> activityArguments, Promise<com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflowOptions> options);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflow#startPeriodicWorkflow}
     */
    Promise<Void> startPeriodicWorkflow(Promise<com.amazonaws.services.simpleworkflow.model.ActivityType> activity, Promise<Object[]> activityArguments, Promise<com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflowOptions> options, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflow#startPeriodicWorkflow}
     */
    Promise<Void> startPeriodicWorkflow(Promise<com.amazonaws.services.simpleworkflow.model.ActivityType> activity, Promise<Object[]> activityArguments, Promise<com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.PeriodicWorkflowOptions> options, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

}