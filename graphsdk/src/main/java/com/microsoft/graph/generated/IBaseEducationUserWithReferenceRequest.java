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
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Education User With Reference Request.
 */
public interface IBaseEducationUserWithReferenceRequest extends IHttpRequest {

    void post(final EducationUser newEducationUser, final IJsonBackedObject payload, final ICallback<EducationUser> callback);

    EducationUser post(final EducationUser newEducationUser, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<EducationUser> callback);

    EducationUser get() throws ClientException;

    IBaseEducationUserWithReferenceRequest select(final String value);

    IBaseEducationUserWithReferenceRequest expand(final String value);

}
