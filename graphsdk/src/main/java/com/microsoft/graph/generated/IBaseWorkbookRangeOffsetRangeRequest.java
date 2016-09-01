// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Range Offset Range Request.
 */
public interface IBaseWorkbookRangeOffsetRangeRequest {

    /**
     * Patches the WorkbookRangeOffsetRange
     *
     * @param callback The callback to be called after success or failure
     */
    void patch(final ICallback<WorkbookRange> callback);

    /**
     * Patches the WorkbookRangeOffsetRange
     *
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    WorkbookRange patch() throws ClientException;

    /**
     * Puts the WorkbookRangeOffsetRange
     *
     * @param callback The callback to be called after success or failure
     */
    void put(final ICallback<WorkbookRange> callback);

    /**
     * Puts the WorkbookRangeOffsetRange
     *
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     WorkbookRange put() throws ClientException;
    /**
     * Gets the WorkbookRange
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookRange> callback);

    /**
     * Gets the WorkbookRange
     *
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    WorkbookRange get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IWorkbookRangeOffsetRangeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IWorkbookRangeOffsetRangeRequest expand(final String value);

}
