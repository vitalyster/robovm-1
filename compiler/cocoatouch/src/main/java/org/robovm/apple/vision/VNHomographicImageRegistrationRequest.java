/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.vision;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHomographicImageRegistrationRequest/*</name>*/ 
    extends /*<extends>*/VNImageRegistrationRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNHomographicImageRegistrationRequestPtr extends Ptr<VNHomographicImageRegistrationRequest, VNHomographicImageRegistrationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNHomographicImageRegistrationRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    /*</constants>*/
    /*<constructors>*/
    protected VNHomographicImageRegistrationRequest() {}
    protected VNHomographicImageRegistrationRequest(Handle h, long handle) { super(h, handle); }
    protected VNHomographicImageRegistrationRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTargetedCVPixelBuffer:options:")
    public VNHomographicImageRegistrationRequest(CVPixelBuffer pixelBuffer, VNImageOption options) { super(pixelBuffer, options); }
    @Method(selector = "initWithTargetedCVPixelBuffer:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CVPixelBuffer pixelBuffer, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(pixelBuffer, options, completionHandler); }
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:")
    public VNHomographicImageRegistrationRequest(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options) { super(pixelBuffer, orientation, options); }
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(pixelBuffer, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedCGImage:options:")
    public VNHomographicImageRegistrationRequest(CGImage cgImage, VNImageOption options) { super(cgImage, options); }
    @Method(selector = "initWithTargetedCGImage:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CGImage cgImage, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(cgImage, options, completionHandler); }
    @Method(selector = "initWithTargetedCGImage:orientation:options:")
    public VNHomographicImageRegistrationRequest(CGImage cgImage, CGImagePropertyOrientation orientation, VNImageOption options) { super(cgImage, orientation, options); }
    @Method(selector = "initWithTargetedCGImage:orientation:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CGImage cgImage, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(cgImage, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedCIImage:options:")
    public VNHomographicImageRegistrationRequest(CIImage ciImage, VNImageOption options) { super(ciImage, options); }
    @Method(selector = "initWithTargetedCIImage:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CIImage ciImage, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(ciImage, options, completionHandler); }
    @Method(selector = "initWithTargetedCIImage:orientation:options:")
    public VNHomographicImageRegistrationRequest(CIImage ciImage, CGImagePropertyOrientation orientation, VNImageOption options) { super(ciImage, orientation, options); }
    @Method(selector = "initWithTargetedCIImage:orientation:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CIImage ciImage, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(ciImage, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedImageURL:options:")
    public VNHomographicImageRegistrationRequest(NSURL imageURL, VNImageOption options) { super(imageURL, options); }
    @Method(selector = "initWithTargetedImageURL:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(NSURL imageURL, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageURL, options, completionHandler); }
    @Method(selector = "initWithTargetedImageURL:orientation:options:")
    public VNHomographicImageRegistrationRequest(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options) { super(imageURL, orientation, options); }
    @Method(selector = "initWithTargetedImageURL:orientation:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageURL, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedImageData:options:")
    public VNHomographicImageRegistrationRequest(NSData imageData, VNImageOption options) { super(imageData, options); }
    @Method(selector = "initWithTargetedImageData:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(NSData imageData, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageData, options, completionHandler); }
    @Method(selector = "initWithTargetedImageData:orientation:options:")
    public VNHomographicImageRegistrationRequest(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options) { super(imageData, orientation, options); }
    @Method(selector = "initWithTargetedImageData:orientation:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageData, orientation, options, completionHandler); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:options:")
    public VNHomographicImageRegistrationRequest(CMSampleBuffer sampleBuffer, VNImageOption options) { super(sampleBuffer, options); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CMSampleBuffer sampleBuffer, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(sampleBuffer, options, completionHandler); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:orientation:options:")
    public VNHomographicImageRegistrationRequest(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options) { super(sampleBuffer, orientation, options); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:orientation:options:completionHandler:")
    public VNHomographicImageRegistrationRequest(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(sampleBuffer, orientation, options, completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
