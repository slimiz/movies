package com.yassir.movies.databinding;
import com.yassir.movies.R;
import com.yassir.movies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMoviesListBindingImpl extends FragmentMoviesListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"search_header_layout"},
            new int[] {2},
            new int[] {com.yassir.movies.R.layout.search_header_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerViewMovie, 3);
        sViewsWithIds.put(R.id.noSearchResultsFound, 4);
        sViewsWithIds.put(R.id.progressBarMovie, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMoviesListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMoviesListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[4]
            , (android.widget.ProgressBar) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.yassir.movies.databinding.SearchHeaderLayoutBinding) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.searchBoxContainer);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        searchBoxContainer.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (searchBoxContainer.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        searchBoxContainer.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchBoxContainer((com.yassir.movies.databinding.SearchHeaderLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchBoxContainer(com.yassir.movies.databinding.SearchHeaderLayoutBinding SearchBoxContainer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(searchBoxContainer);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchBoxContainer
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}