
    /**
     * Use with
     * {@link com.jmedeisis.draglinearlayout.DragLinearLayout#setOnViewSwapListener(com.jmedeisis.draglinearlayout.DragLinearLayout.OnViewSwapListener)} to
     * listen for draggable view swaps.
     */
    public interface OnViewSwapListener
    {
        /**
         * Invoked right before the two items are swapped due to a drag event. After the swap, the firstView will be in the secondPosition, and vice versa.
         * <p/>
         * No guarantee is made as to which of the two has a lesser/greater position.
         */
        void onSwap(View firstView, int firstPosition, View secondView, int secondPosition);
    }