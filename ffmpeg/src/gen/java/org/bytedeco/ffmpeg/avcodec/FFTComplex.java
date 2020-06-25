// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class FFTComplex extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FFTComplex() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FFTComplex(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FFTComplex(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FFTComplex position(long position) {
        return (FFTComplex)super.position(position);
    }

    public native @Cast("FFTSample") float re(); public native FFTComplex re(float setter);
    public native @Cast("FFTSample") float im(); public native FFTComplex im(float setter);
}
