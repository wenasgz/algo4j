## build script

cmake_minimum_required(VERSION 2.7)

project(jni)

find_package(Java REQUIRED)
find_package(JNI REQUIRED)

if (JNI_FOUND)
    message(STATUS "JNI_INCLUDE_DIRS=${JNI_INCLUDE_DIRS}")
    message(STATUS "JNI_LIBRARIES=${JNI_LIBRARIES}")
endif ()

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")
set(BUILD_USE_64BITS on)

set(
        SOURCE_TEMPLATES
        global/basics.hpp
        global/templates.hpp
        global/sort.hpp
        global/heap.hpp
)

set(
        SOURCE_FILES
        graph/AdjacentMatrixGraph.cpp
        tree/bit/BinaryIndexedTree.cpp
        tree/heap/MinHeap.cpp
        tree/heap/MaxHeap.cpp
        graph/FrontStarGraph.cpp
        math/Trigonometric.cpp
        global/functions.cpp
        global/trie.cpp
        tree/Trie.cpp
        util/Statistics.cpp
        math/MathUtils.cpp
        tree/UnionSet.cpp
        global/bigint.cpp
        global/complex.cpp
        util/SeqUtils.cpp
        global/matrix.cpp
        math/BigInt.cpp
        tree/Segtree.cpp math/Vector.cpp util/MemoryHelper.cpp math/Matrix.cpp)

set(
        SOURCE_HEADERS
        graph/AdjacentMatrixGraph.h
        tree/bit/BinaryIndexedTree.h
        tree/heap/MinHeap.h
        tree/heap/MaxHeap.h
        tree/SEGTREE.H
        graph/FrontStarGraph.h
        math/Trigonometric.h
        math/Vector.h
        math/Matrix.h
        global/functions.h
        global/trie.h
        tree/Trie.h
        util/Statistics.h
        util/MemoryHelper.h
        global/complex.h
        math/MathUtils.h
        tree/UnionSet.h
        global/bigint.h
        global/matrix.h
        util/SeqUtils.h
        math/BigInt.h
        global/segtree.h)

# add_executable(
# jniexe
# ${SOURCE_FILES}
# ${SOURCE_HEADERS}
# ${SOURCE_TEMPLATES}
# )

set(
        WIN_API
        win/WinApi.cpp
        win/WinApi.h
)

include_directories(${JNI_INCLUDE_DIRS})

if (CMAKE_SYSTEM_NAME MATCHES "Windows")
    add_library(
            jni
            SHARED
            ${WIN_API}
            ${SOURCE_FILES}
            ${SOURCE_TEMPLATES}
            ${SOURCE_HEADERS}
    )
else ()
    add_library(
            jni
            SHARED
            ${SOURCE_FILES}
            ${SOURCE_TEMPLATES}
            ${SOURCE_HEADERS}
    )
endif ()


target_link_libraries(jni)
