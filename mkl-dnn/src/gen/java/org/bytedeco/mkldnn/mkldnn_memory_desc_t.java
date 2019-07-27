// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** Memory descriptor. The description is based on a number of dimensions,
 *  dimensions themselves, plus information about elements type and memory
 *  format. Additionally, contains format-specific descriptions of the data
 *  layout. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_memory_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_memory_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_memory_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_memory_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_memory_desc_t position(long position) {
        return (mkldnn_memory_desc_t)super.position(position);
    }

    /** Number of dimensions */
    
    ///
    public native int ndims(); public native mkldnn_memory_desc_t ndims(int setter);
    /** Dimensions in the following order:
     *  - CNN data tensors: mini-batch, channel, spatial
     *    (<code>{N, C, [[D,] H,] W}</code>)
     *  - CNN weight tensors: group (optional), output channel, input channel,
     *    spatial (<code>{[G,] O, I, [[D,] H,] W}</code>)
     *  - RNN data tensors: time, mini-batch, channels (<code>{T, N, C}</code>)
     *    or layers, directions, states, mini-batch, channels (<code>{L, D, S, N, C}</code>)
     *  - RNN weight tensor: layers, directions, input channel, gates, output channels
     *    (<code>{L, D, I, G, O}</code>).
     * 
     *  \note
     *     The order of dimensions does not depend on the memory format, so
     *     whether the data is laid out in #mkldnn_nchw or #mkldnn_nhwc
     *     the dims for 4D CN data tensor would be <code>{N, C, H, W}</code>. */
    @MemberGetter public native @Cast("int64_t*") LongPointer dims();

    /** Data type of the tensor elements. */
    public native @Cast("mkldnn_data_type_t") int data_type(); public native mkldnn_memory_desc_t data_type(int setter);

    /** Size of the data including padding in each dimension. */
    @MemberGetter public native @Cast("int64_t*") LongPointer padded_dims();

    /** Per-dimension offset from the padding to actual data, the top-level
     *  tensor with offsets applied must lie within the padding area. */
    @MemberGetter public native @Cast("int64_t*") LongPointer padded_offsets();

    /** Offset from memory origin to the current block, non-zero only in
     *  a description of a memory sub-block. */
    public native @Cast("mkldnn_dim_t") long offset0(); public native mkldnn_memory_desc_t offset0(long setter);

    /** Memory format kind. */
    public native @Cast("mkldnn_format_kind_t") int format_kind(); public native mkldnn_memory_desc_t format_kind(int setter);
        /** Description of the data layout for memory formats that use
         *  blocking. */
        @Name("format_desc.blocking") public native @ByRef mkldnn_blocking_desc_t format_desc_blocking(); public native mkldnn_memory_desc_t format_desc_blocking(mkldnn_blocking_desc_t setter);
        /** Tensor of weights for integer 8bit winograd convolution. */
        @Name("format_desc.wino_desc") public native @ByRef mkldnn_wino_desc_t format_desc_wino_desc(); public native mkldnn_memory_desc_t format_desc_wino_desc(mkldnn_wino_desc_t setter);
        /** Tensor of packed weights for RNN. */
        @Name("format_desc.rnn_packed_desc") public native @ByRef mkldnn_rnn_packed_desc_t format_desc_rnn_packed_desc(); public native mkldnn_memory_desc_t format_desc_rnn_packed_desc(mkldnn_rnn_packed_desc_t setter);
        // ... other descriptions possible

    public native @ByRef mkldnn_memory_extra_desc_t extra(); public native mkldnn_memory_desc_t extra(mkldnn_memory_extra_desc_t setter);
}
