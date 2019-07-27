// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** Generic description of blocked data layout for most memory formats.
 * 
 *  @see \ref dev_guide_understanding_memory_formats */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_blocking_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_blocking_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_blocking_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_blocking_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_blocking_desc_t position(long position) {
        return (mkldnn_blocking_desc_t)super.position(position);
    }

<<<<<<< HEAD
    /** Block size for each of the dimensions. */
    @MemberGetter public native IntPointer block_dims();
    /** strides[0]: stride between the first elements of adjacent blocks.
     * \n strides[1]: strides between elements in the same block. */
    @MemberGetter public native @Cast("ptrdiff_t*") SizeTPointer strides(int i);
    @MemberGetter public native @Cast("ptrdiff_t**") PointerPointer strides();
    /** Size of the data including padding in each dimension. */
    @MemberGetter public native IntPointer padding_dims();
    /** Per-dimension offset from the padding to actual data, the top-level
     * tensor with offsets applied must lie within the padding area. */
    @MemberGetter public native IntPointer offset_padding_to_data();
    /** Offset from memory origin to the current block, non-zero only in
     * a description of a memory sub-block. */
    public native @Cast("ptrdiff_t") long offset_padding(); public native mkldnn_blocking_desc_t offset_padding(long setter);
=======
    /** The strides between the outermost blocks.
     *  In case of plain (non-blocked) formats the strides between dimensions. */
    @MemberGetter public native @Cast("int64_t*") LongPointer strides();
    // Innermost section
    // ASSUMPTION: the innermost blocks are always dense
    /** The number of innermost blocks, e.g. 3 in case of {@code OIhw_4i16o4i_} */
    public native int inner_nblks(); public native mkldnn_blocking_desc_t inner_nblks(int setter);
    /** The size of the blocks, e.g. {@code {4, 16, 4}} in case of {@code OIhw_4i16o4i} */
    @MemberGetter public native @Cast("int64_t*") LongPointer inner_blks();
    /** The logical indices of the blocks, e.g. {@code {1, 0, 1}} in case of
     *  {@code 4i16o4i}, because {@code i} is the 1st dim and {@code o} is the 0st dim */
    @MemberGetter public native @Cast("int64_t*") LongPointer inner_idxs();
>>>>>>>  * Upgrade presets for MKL-DNN 1.0 (pull #765)
}
