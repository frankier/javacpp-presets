// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IElementWiseLayer
 * 
 *  \brief A elementwise layer in a network definition.
 * 
 *  This layer applies a per-element binary operation between corresponding elements of two tensors.
 * 
 *  The input dimensions of the two input tensors must be equal, and the output tensor is the same size as each input. */
//！
/** \warning When running this layer on the DLA with Int8 data type, the dynamic ranges of two input tensors shall be
/** equal. If the dynamic ranges are generated using calibrator, the largest value shall be used.
/**
/** \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
/** */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IElementWiseLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IElementWiseLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the binary operation for the layer.
     * 
     *  DLA supports only kSUM, kPROD, kMAX and kMIN.
     * 
     *  @see getOperation(), ElementWiseOperation
     * 
     *  @see getBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setOperation(ElementWiseOperation op);
    public native void setOperation(@Cast("nvinfer1::ElementWiseOperation") int op);

    /**
     *  \brief Get the binary operation for the layer.
     * 
     *  @see setOperation(), ElementWiseOperation
     * 
     *  @see setBiasWeights()
     *  */
    public native ElementWiseOperation getOperation();
}
