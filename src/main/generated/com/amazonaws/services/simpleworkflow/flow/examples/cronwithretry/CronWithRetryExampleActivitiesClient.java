/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryExampleActivities}. 
 * Used to invoke activities asynchronously from workflow code.
 */
public interface CronWithRetryExampleActivitiesClient extends ActivitiesClient
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryExampleActivities#doSomeWork}
     */
    Promise<Void> doSomeWork(String parameter);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryExampleActivities#doSomeWork}
     */
    Promise<Void> doSomeWork(String parameter, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryExampleActivities#doSomeWork}
     */
    Promise<Void> doSomeWork(String parameter, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryExampleActivities#doSomeWork}
     */
    Promise<Void> doSomeWork(Promise<String> parameter);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryExampleActivities#doSomeWork}
     */
    Promise<Void> doSomeWork(Promise<String> parameter, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryExampleActivities#doSomeWork}
     */
    Promise<Void> doSomeWork(Promise<String> parameter, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

}