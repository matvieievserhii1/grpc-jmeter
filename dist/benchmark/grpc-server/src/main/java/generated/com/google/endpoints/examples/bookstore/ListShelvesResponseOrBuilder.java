// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: http_bookstore.proto

package generated.com.google.endpoints.examples.bookstore;

public interface ListShelvesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookstore.ListShelvesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Shelves in the bookstore.
   * </pre>
   *
   * <code>repeated .bookstore.Shelf shelves = 1;</code>
   */
  java.util.List<generated.com.google.endpoints.examples.bookstore.ShelfProto.Shelf> 
      getShelvesList();
  /**
   * <pre>
   * Shelves in the bookstore.
   * </pre>
   *
   * <code>repeated .bookstore.Shelf shelves = 1;</code>
   */
  generated.com.google.endpoints.examples.bookstore.ShelfProto.Shelf getShelves(int index);
  /**
   * <pre>
   * Shelves in the bookstore.
   * </pre>
   *
   * <code>repeated .bookstore.Shelf shelves = 1;</code>
   */
  int getShelvesCount();
  /**
   * <pre>
   * Shelves in the bookstore.
   * </pre>
   *
   * <code>repeated .bookstore.Shelf shelves = 1;</code>
   */
  java.util.List<? extends generated.com.google.endpoints.examples.bookstore.ShelfProto.ShelfOrBuilder> 
      getShelvesOrBuilderList();
  /**
   * <pre>
   * Shelves in the bookstore.
   * </pre>
   *
   * <code>repeated .bookstore.Shelf shelves = 1;</code>
   */
  generated.com.google.endpoints.examples.bookstore.ShelfProto.ShelfOrBuilder getShelvesOrBuilder(
      int index);
}
