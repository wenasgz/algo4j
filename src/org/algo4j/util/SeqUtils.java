package org.algo4j.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by ice1000 on 2016/11/18.
 *
 * @author ice1000
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public final class SeqUtils {
	private SeqUtils() {
	}

	/**
	 * O(length) = length * 2 + log(length)
	 * to do discretization to the given array.
	 *
	 * @param data the array to be discretization.
	 */
	public static native void discretization(@NotNull long[] data);

	/**
	 * @see SeqUtils#discretization(long[])
	 */
	public static native void discretization(@NotNull int[] data);

	/**
	 * @see SeqUtils#discretization(long[])
	 */
	public static native void discretization(@NotNull float[] data);

	/**
	 * @see SeqUtils#discretization(long[])
	 */
	public static native void discretization(@NotNull double[] data);

	/**
	 * O(length) = 2 * log(length)
	 * returns the inversion number of the given array.
	 *
	 * @param data given array
	 * @return inversion number
	 */
	public static native long inversion(@NotNull int[] data);

	/**
	 * @see SeqUtils#inversion(int[])
	 */
	public static native long inversion(@NotNull long[] data);

	/**
	 * @see SeqUtils#inversion(int[])
	 */
	public static native long inversion(@NotNull float[] data);

	/**
	 * @see SeqUtils#inversion(int[])
	 */
	public static native long inversion(@NotNull double[] data);

	/**
	 * O(len) = len ^ 2
	 * bubble sort
	 *
	 * @param data the array to be sort
	 */
	public static native void sortBubble(@NotNull int[] data);

	/**
	 * @see SeqUtils#sortBubble(int[])
	 */
	public static native void sortBubble(@NotNull long[] data);

	/**
	 * @see SeqUtils#sortBubble(int[])
	 */
	public static native void sortBubble(@NotNull float[] data);

	/**
	 * @see SeqUtils#sortBubble(int[])
	 */
	public static native void sortBubble(@NotNull double[] data);

	/**
	 * O(len) = { long(len), len ^ 2 } depends on the array
	 * quick sort
	 *
	 * @param data the array to be sort
	 */
	public static native void sortQuick(@NotNull int[] data);

	/**
	 * @see SeqUtils#sortQuick(int[])
	 */
	public static native void sortQuick(@NotNull long[] data);

	/**
	 * @see SeqUtils#sortQuick(int[])
	 */
	public static native void sortQuick(@NotNull float[] data);

	/**
	 * @see SeqUtils#sortQuick(int[])
	 */
	public static native void sortQuick(@NotNull double[] data);

	public static native void sortInsertion(@NotNull int[] data);

	public static native void sortInsertion(@NotNull long[] data);

	public static native void sortInsertion(@NotNull float[] data);

	public static native void sortInsertion(@NotNull double[] data);

	public static native void sortMerge(@NotNull int[] data);

	public static native void sortMerge(@NotNull long[] data);

	public static native void sortMerge(@NotNull float[] data);

	public static native void sortMerge(@NotNull double[] data);

	public static native void sortComb(@NotNull int[] data);

	public static native void sortComb(@NotNull long[] data);

	public static native void sortComb(@NotNull float[] data);

	public static native void sortComb(@NotNull double[] data);

	public static native void sortSelection(@NotNull int[] data);

	public static native void sortSelection(@NotNull long[] data);

	public static native void sortSelection(@NotNull float[] data);

	public static native void sortSelection(@NotNull double[] data);

	public static native void sortCocktail(@NotNull int[] data);

	public static native void sortCocktail(@NotNull long[] data);

	public static native void sortCocktail(@NotNull float[] data);

	public static native void sortCocktail(@NotNull double[] data);

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	@SuppressWarnings({"ConstantConditions", "ResultOfMethodCallIgnored"})
	public static <T> String toString(@Nullable T[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			if (a[i] != null) a[i].toString();
			else b.append("null");
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	public static String toString(@Nullable long[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			b.append(a[i]);
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	public static String toString(@Nullable int[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			b.append(a[i]);
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	public static String toString(@Nullable byte[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			b.append(a[i]);
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	public static String toString(@Nullable float[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			b.append(a[i]);
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	public static String toString(@Nullable double[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			b.append(a[i]);
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	public static String toString(@Nullable short[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			b.append(a[i]);
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

	/**
	 * Returns a string representation of the contents of the specified array.
	 */
	@NotNull
	public static String toString(@Nullable char[] a) {
		if (a == null) return "null";
		if (a.length - 1 == -1) return "[]";

		StringBuilder b = new StringBuilder();
		b.append("[<");
		for (int i = 0; ; ++i) {
			b.append(a[i]);
			if (i == a.length - 1) return b.append(">]").toString();
			b.append(">, <");
		}
	}

}
