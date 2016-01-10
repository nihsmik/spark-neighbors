package io.github.karlhigley.neighbors.lsh

import org.apache.spark.mllib.linalg.SparseVector

/**
 * Abstract base class for locality-sensitive hash functions.
 */
private[neighbors] abstract class LSHFunction[+T <: Signature[_]] {

  /**
   * Compute the hash signature of the supplied vector
   */
  def signature(v: SparseVector): T

  /**
   * Build a hash table entry for the supplied vector
   */
  def hashTableEntry(id: Int, table: Int, v: SparseVector): HashTableEntry[T]
}
