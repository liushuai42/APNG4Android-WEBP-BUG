package com.github.webpanimated

import android.content.Context
import android.graphics.drawable.Drawable
import com.bumptech.glide.Glide
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.Options
import com.bumptech.glide.load.ResourceDecoder
import com.bumptech.glide.load.engine.Resource
import com.bumptech.glide.module.LibraryGlideModule
import java.nio.ByteBuffer


@GlideModule
class NineGlideModule : LibraryGlideModule() {
    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
        super.registerComponents(context, glide, registry)
        registry.prepend(ByteBuffer::class.java, Drawable::class.java, NinePatchResourceDecoder())
    }
}

class NinePatchResourceDecoder : ResourceDecoder<ByteBuffer, Drawable> {
    /**
     * Just a mock ResourceDecoder, won't work, return false
     */
    override fun handles(source: ByteBuffer, options: Options) = false

    override fun decode(
        source: ByteBuffer,
        width: Int,
        height: Int,
        options: Options
    ): Resource<Drawable>? {
        TODO("Not yet implemented")
    }
}