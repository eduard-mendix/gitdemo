import { background, border, contrast, spacing } from '../app/custom-variables';


/* ==========================================================================
    Maps

========================================================================== */


//== Elements
//-------------------------------------------------------------------------------------------------------------------//


export const mapContainerBottom = {
    container: {
        flexDirection: "row",
        alignItems: "center",
        bottom: 0,
        position: "absolute",
    },
};

export const mapList = {
    container: {
        paddingHorizontal: spacing.regular,
    },
};

export const mapListItemImage = {
    container: {
        backgroundColor: background.primary,
        borderRadius: border.radiusSmall,
        marginVertical: spacing.regular,
        marginLeft: spacing.smallest,
        marginRight: spacing.regular,
        elevation: 4,
        shadowColor: contrast.low,
        shadowOpacity: 0.8,
        shadowRadius: 8,
        shadowOffset: {
            width: 0,
            height: 2,
        },
    },
    image: {
        borderRadius: border.radiusSmall,
    },
};


//== Variations
//-------------------------------------------------------------------------------------------------------------------//
//
