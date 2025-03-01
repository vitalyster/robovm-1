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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARSKViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/SKViewDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements ARSKViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("view:nodeForAnchor:")
    public SKNode getNodeForAnchor(ARSKView view, ARAnchor anchor) { return null; }
    @NotImplemented("view:didAddNode:forAnchor:")
    public void didAddNode(ARSKView view, SKNode node, ARAnchor anchor) {}
    @NotImplemented("view:willUpdateNode:forAnchor:")
    public void willUpdateNode(ARSKView view, SKNode node, ARAnchor anchor) {}
    @NotImplemented("view:didUpdateNode:forAnchor:")
    public void didUpdateNode(ARSKView view, SKNode node, ARAnchor anchor) {}
    @NotImplemented("view:didRemoveNode:forAnchor:")
    public void didRemoveNode(ARSKView view, SKNode node, ARAnchor anchor) {}
    @NotImplemented("session:didFailWithError:")
    public void didFailWithError(ARSession session, NSError error) {}
    @NotImplemented("session:cameraDidChangeTrackingState:")
    public void cameraDidChangeTrackingState(ARSession session, ARCamera camera) {}
    @NotImplemented("sessionWasInterrupted:")
    public void sessionWasInterrupted(ARSession session) {}
    @NotImplemented("sessionInterruptionEnded:")
    public void sessionInterruptionEnded(ARSession session) {}
    /**
     * @since Available in iOS 11.3 and later.
     */
    @NotImplemented("sessionShouldAttemptRelocalization:")
    public boolean sessionShouldAttemptRelocalization(ARSession session) { return false; }
    @NotImplemented("session:didOutputAudioSampleBuffer:")
    public void didOutputAudioSampleBuffer(ARSession session, CMSampleBuffer audioSampleBuffer) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("session:didOutputCollaborationData:")
    public void didOutputCollaborationData(ARSession session, ARCollaborationData data) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("session:didChangeGeoTrackingStatus:")
    public void didChangeGeoTrackingStatus(ARSession session, ARGeoTrackingStatus geoTrackingStatus) {}
    /*</methods>*/
}
