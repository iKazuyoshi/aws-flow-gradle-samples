/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.deployment;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class DeploymentActivitiesClientImpl extends ActivitiesClientBase implements DeploymentActivitiesClient {

	public DeploymentActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public DeploymentActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public DeploymentActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<String> deployDatabase() {
        return deployDatabaseImpl((ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<String> deployDatabase(Promise<?>... waitFor) {
        return deployDatabaseImpl((ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<String> deployDatabase(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return deployDatabaseImpl(optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<String> deployDatabaseImpl(final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("DeploymentActivities.deployDatabase");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[0];

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, String.class, waitFor);
    }

    @Override
    public final Promise<String> deployAppServer(java.util.List<java.lang.String> dataSources) {
        return deployAppServerImpl(Promise.asPromise(dataSources), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<String> deployAppServer(java.util.List<java.lang.String> dataSources, Promise<?>... waitFor) {
        return deployAppServerImpl(Promise.asPromise(dataSources), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<String> deployAppServer(java.util.List<java.lang.String> dataSources, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return deployAppServerImpl(Promise.asPromise(dataSources), optionsOverride, waitFor);
    }

    @Override
    public final Promise<String> deployAppServer(Promise<java.util.List<java.lang.String>> dataSources) {
        return deployAppServerImpl(dataSources, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<String> deployAppServer(Promise<java.util.List<java.lang.String>> dataSources, Promise<?>... waitFor) {
        return deployAppServerImpl(dataSources, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<String> deployAppServer(Promise<java.util.List<java.lang.String>> dataSources, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return deployAppServerImpl(dataSources, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<String> deployAppServerImpl(final Promise<java.util.List<java.lang.String>> dataSources, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("DeploymentActivities.deployAppServer");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = dataSources;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, String.class, waitFor);
    }

    @Override
    public final Promise<String> deployWebServer(java.util.List<java.lang.String> appServerUrls, java.util.List<java.lang.String> dataSources) {
        return deployWebServerImpl(Promise.asPromise(appServerUrls), Promise.asPromise(dataSources), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<String> deployWebServer(java.util.List<java.lang.String> appServerUrls, java.util.List<java.lang.String> dataSources, Promise<?>... waitFor) {
        return deployWebServerImpl(Promise.asPromise(appServerUrls), Promise.asPromise(dataSources), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<String> deployWebServer(java.util.List<java.lang.String> appServerUrls, java.util.List<java.lang.String> dataSources, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return deployWebServerImpl(Promise.asPromise(appServerUrls), Promise.asPromise(dataSources), optionsOverride, waitFor);
    }

    @Override
    public final Promise<String> deployWebServer(Promise<java.util.List<java.lang.String>> appServerUrls, Promise<java.util.List<java.lang.String>> dataSources) {
        return deployWebServerImpl(appServerUrls, dataSources, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<String> deployWebServer(Promise<java.util.List<java.lang.String>> appServerUrls, Promise<java.util.List<java.lang.String>> dataSources, Promise<?>... waitFor) {
        return deployWebServerImpl(appServerUrls, dataSources, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<String> deployWebServer(Promise<java.util.List<java.lang.String>> appServerUrls, Promise<java.util.List<java.lang.String>> dataSources, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return deployWebServerImpl(appServerUrls, dataSources, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<String> deployWebServerImpl(final Promise<java.util.List<java.lang.String>> appServerUrls, final Promise<java.util.List<java.lang.String>> dataSources, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("DeploymentActivities.deployWebServer");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[2];
        _input_[0] = appServerUrls;
        _input_[1] = dataSources;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, String.class, waitFor);
    }

    @Override
    public final Promise<String> deployLoadBalancer(java.util.List<java.lang.String> frontendUrls) {
        return deployLoadBalancerImpl(Promise.asPromise(frontendUrls), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<String> deployLoadBalancer(java.util.List<java.lang.String> frontendUrls, Promise<?>... waitFor) {
        return deployLoadBalancerImpl(Promise.asPromise(frontendUrls), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<String> deployLoadBalancer(java.util.List<java.lang.String> frontendUrls, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return deployLoadBalancerImpl(Promise.asPromise(frontendUrls), optionsOverride, waitFor);
    }

    @Override
    public final Promise<String> deployLoadBalancer(Promise<java.util.List<java.lang.String>> frontendUrls) {
        return deployLoadBalancerImpl(frontendUrls, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<String> deployLoadBalancer(Promise<java.util.List<java.lang.String>> frontendUrls, Promise<?>... waitFor) {
        return deployLoadBalancerImpl(frontendUrls, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<String> deployLoadBalancer(Promise<java.util.List<java.lang.String>> frontendUrls, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return deployLoadBalancerImpl(frontendUrls, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<String> deployLoadBalancerImpl(final Promise<java.util.List<java.lang.String>> frontendUrls, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("DeploymentActivities.deployLoadBalancer");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = frontendUrls;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, String.class, waitFor);
    }

}