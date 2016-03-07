/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.splitmerge;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class AverageCalculatorActivitiesClientImpl extends ActivitiesClientBase implements AverageCalculatorActivitiesClient {

	public AverageCalculatorActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public AverageCalculatorActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public AverageCalculatorActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<Integer> computeDataSizeForInputData(String bucketName, String filename) {
        return computeDataSizeForInputDataImpl(Promise.asPromise(bucketName), Promise.asPromise(filename), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Integer> computeDataSizeForInputData(String bucketName, String filename, Promise<?>... waitFor) {
        return computeDataSizeForInputDataImpl(Promise.asPromise(bucketName), Promise.asPromise(filename), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Integer> computeDataSizeForInputData(String bucketName, String filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return computeDataSizeForInputDataImpl(Promise.asPromise(bucketName), Promise.asPromise(filename), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Integer> computeDataSizeForInputData(Promise<String> bucketName, Promise<String> filename) {
        return computeDataSizeForInputDataImpl(bucketName, filename, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Integer> computeDataSizeForInputData(Promise<String> bucketName, Promise<String> filename, Promise<?>... waitFor) {
        return computeDataSizeForInputDataImpl(bucketName, filename, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Integer> computeDataSizeForInputData(Promise<String> bucketName, Promise<String> filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return computeDataSizeForInputDataImpl(bucketName, filename, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Integer> computeDataSizeForInputDataImpl(final Promise<String> bucketName, final Promise<String> filename, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("computeDataSize");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[2];
        _input_[0] = bucketName;
        _input_[1] = filename;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Integer.class, waitFor);
    }

    @Override
    public final Promise<Integer> computeSumForChunk(String bucketName, String filename, int chunkNumber, int chunkSize) {
        return computeSumForChunkImpl(Promise.asPromise(bucketName), Promise.asPromise(filename), Promise.asPromise(chunkNumber), Promise.asPromise(chunkSize), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Integer> computeSumForChunk(String bucketName, String filename, int chunkNumber, int chunkSize, Promise<?>... waitFor) {
        return computeSumForChunkImpl(Promise.asPromise(bucketName), Promise.asPromise(filename), Promise.asPromise(chunkNumber), Promise.asPromise(chunkSize), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Integer> computeSumForChunk(String bucketName, String filename, int chunkNumber, int chunkSize, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return computeSumForChunkImpl(Promise.asPromise(bucketName), Promise.asPromise(filename), Promise.asPromise(chunkNumber), Promise.asPromise(chunkSize), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Integer> computeSumForChunk(Promise<String> bucketName, Promise<String> filename, Promise<Integer> chunkNumber, Promise<Integer> chunkSize) {
        return computeSumForChunkImpl(bucketName, filename, chunkNumber, chunkSize, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Integer> computeSumForChunk(Promise<String> bucketName, Promise<String> filename, Promise<Integer> chunkNumber, Promise<Integer> chunkSize, Promise<?>... waitFor) {
        return computeSumForChunkImpl(bucketName, filename, chunkNumber, chunkSize, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Integer> computeSumForChunk(Promise<String> bucketName, Promise<String> filename, Promise<Integer> chunkNumber, Promise<Integer> chunkSize, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return computeSumForChunkImpl(bucketName, filename, chunkNumber, chunkSize, optionsOverride, waitFor);
    }
    
    @com.amazonaws.services.simpleworkflow.flow.annotations.ExponentialRetry(
initialRetryIntervalSeconds=10
, maximumAttempts=10)

    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Integer> computeSumForChunkImpl(final Promise<String> bucketName, final Promise<String> filename, final Promise<Integer> chunkNumber, final Promise<Integer> chunkSize, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("AverageCalculatorActivities.computeSumForChunk");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[4];
        _input_[0] = bucketName;
        _input_[1] = filename;
        _input_[2] = chunkNumber;
        _input_[3] = chunkSize;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Integer.class, waitFor);
    }

    @Override
    public final Promise<Void> reportResult(double average) {
        return reportResultImpl(Promise.asPromise(average), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> reportResult(double average, Promise<?>... waitFor) {
        return reportResultImpl(Promise.asPromise(average), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> reportResult(double average, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return reportResultImpl(Promise.asPromise(average), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> reportResult(Promise<Double> average) {
        return reportResultImpl(average, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> reportResult(Promise<Double> average, Promise<?>... waitFor) {
        return reportResultImpl(average, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> reportResult(Promise<Double> average, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return reportResultImpl(average, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Void> reportResultImpl(final Promise<Double> average, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("AverageCalculatorActivities.reportResult");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = average;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Void.class, waitFor);
    }

}