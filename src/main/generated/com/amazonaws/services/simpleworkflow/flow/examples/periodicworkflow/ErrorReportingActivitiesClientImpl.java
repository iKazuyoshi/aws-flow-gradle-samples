/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class ErrorReportingActivitiesClientImpl extends ActivitiesClientBase implements ErrorReportingActivitiesClient {

	public ErrorReportingActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public ErrorReportingActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public ErrorReportingActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<Void> reportFailure(Throwable e) {
        return reportFailureImpl(Promise.asPromise(e), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> reportFailure(Throwable e, Promise<?>... waitFor) {
        return reportFailureImpl(Promise.asPromise(e), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> reportFailure(Throwable e, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return reportFailureImpl(Promise.asPromise(e), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> reportFailure(Promise<Throwable> e) {
        return reportFailureImpl(e, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> reportFailure(Promise<Throwable> e, Promise<?>... waitFor) {
        return reportFailureImpl(e, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> reportFailure(Promise<Throwable> e, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return reportFailureImpl(e, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Void> reportFailureImpl(final Promise<Throwable> e, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("ErrorReportingActivities.reportFailure");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = e;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Void.class, waitFor);
    }

}