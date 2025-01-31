// Generated by data binding compiler. Do not edit!
package com.application.mvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.mvvm.R;
import com.application.mvvm.data.Book;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BooksBinding extends ViewDataBinding {
  @Bindable
  protected Book mBook;

  protected BooksBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setBook(@Nullable Book book);

  @Nullable
  public Book getBook() {
    return mBook;
  }

  @NonNull
  public static BooksBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_book, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BooksBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BooksBinding>inflateInternal(inflater, R.layout.row_book, root, attachToRoot, component);
  }

  @NonNull
  public static BooksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_book, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BooksBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<BooksBinding>inflateInternal(inflater, R.layout.row_book, null, false, component);
  }

  public static BooksBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static BooksBinding bind(@NonNull View view, @Nullable Object component) {
    return (BooksBinding)bind(component, view, R.layout.row_book);
  }
}
