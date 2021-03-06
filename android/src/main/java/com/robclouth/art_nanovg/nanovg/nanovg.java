/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robclouth.art_nanovg.nanovg;

public class nanovg implements nanovgConstants {
  public static SWIGTYPE_p_NVGcontext nvgCreateGLES2(int flags) {
    long cPtr = nanovgJNI.nvgCreateGLES2(flags);
    return (cPtr == 0) ? null : new SWIGTYPE_p_NVGcontext(cPtr, false);
  }

  public static void nvgDeleteGLES2(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgDeleteGLES2(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static int nvglCreateImageFromHandleGLES2(SWIGTYPE_p_NVGcontext ctx, SWIGTYPE_p_GLuint textureId, int w, int h, int flags) {
    return nanovgJNI.nvglCreateImageFromHandleGLES2(SWIGTYPE_p_NVGcontext.getCPtr(ctx), SWIGTYPE_p_GLuint.getCPtr(textureId), w, h, flags);
  }

  public static SWIGTYPE_p_GLuint nvglImageHandleGLES2(SWIGTYPE_p_NVGcontext ctx, int image) {
    return new SWIGTYPE_p_GLuint(nanovgJNI.nvglImageHandleGLES2(SWIGTYPE_p_NVGcontext.getCPtr(ctx), image), true);
  }

  public static int glnvg__maxi(int a, int b) {
    return nanovgJNI.glnvg__maxi(a, b);
  }

  public static long glnvg__nearestPow2(long num) {
    return nanovgJNI.glnvg__nearestPow2(num);
  }

  public static void glnvg__bindTexture(GLNVGcontext gl, SWIGTYPE_p_GLuint tex) {
    nanovgJNI.glnvg__bindTexture(GLNVGcontext.getCPtr(gl), gl, SWIGTYPE_p_GLuint.getCPtr(tex));
  }

  public static void glnvg__stencilMask(GLNVGcontext gl, SWIGTYPE_p_GLuint mask) {
    nanovgJNI.glnvg__stencilMask(GLNVGcontext.getCPtr(gl), gl, SWIGTYPE_p_GLuint.getCPtr(mask));
  }

  public static void glnvg__stencilFunc(GLNVGcontext gl, SWIGTYPE_p_GLenum func, SWIGTYPE_p_GLint ref, SWIGTYPE_p_GLuint mask) {
    nanovgJNI.glnvg__stencilFunc(GLNVGcontext.getCPtr(gl), gl, SWIGTYPE_p_GLenum.getCPtr(func), SWIGTYPE_p_GLint.getCPtr(ref), SWIGTYPE_p_GLuint.getCPtr(mask));
  }

  public static GLNVGtexture glnvg__allocTexture(GLNVGcontext gl) {
    long cPtr = nanovgJNI.glnvg__allocTexture(GLNVGcontext.getCPtr(gl), gl);
    return (cPtr == 0) ? null : new GLNVGtexture(cPtr, false);
  }

  public static GLNVGtexture glnvg__findTexture(GLNVGcontext gl, int id) {
    long cPtr = nanovgJNI.glnvg__findTexture(GLNVGcontext.getCPtr(gl), gl, id);
    return (cPtr == 0) ? null : new GLNVGtexture(cPtr, false);
  }

  public static int glnvg__deleteTexture(GLNVGcontext gl, int id) {
    return nanovgJNI.glnvg__deleteTexture(GLNVGcontext.getCPtr(gl), gl, id);
  }

  public static void glnvg__dumpShaderError(SWIGTYPE_p_GLuint shader, String name, String type) {
    nanovgJNI.glnvg__dumpShaderError(SWIGTYPE_p_GLuint.getCPtr(shader), name, type);
  }

  public static void glnvg__dumpProgramError(SWIGTYPE_p_GLuint prog, String name) {
    nanovgJNI.glnvg__dumpProgramError(SWIGTYPE_p_GLuint.getCPtr(prog), name);
  }

  public static void glnvg__checkError(GLNVGcontext gl, String str) {
    nanovgJNI.glnvg__checkError(GLNVGcontext.getCPtr(gl), gl, str);
  }

  public static int glnvg__createShader(GLNVGshader shader, String name, String header, String opts, String vshader, String fshader) {
    return nanovgJNI.glnvg__createShader(GLNVGshader.getCPtr(shader), shader, name, header, opts, vshader, fshader);
  }

  public static void glnvg__deleteShader(GLNVGshader shader) {
    nanovgJNI.glnvg__deleteShader(GLNVGshader.getCPtr(shader), shader);
  }

  public static void glnvg__getUniforms(GLNVGshader shader) {
    nanovgJNI.glnvg__getUniforms(GLNVGshader.getCPtr(shader), shader);
  }

  public static int glnvg__renderCreate(SWIGTYPE_p_void uptr) {
    return nanovgJNI.glnvg__renderCreate(SWIGTYPE_p_void.getCPtr(uptr));
  }

  public static int glnvg__renderCreateTexture(SWIGTYPE_p_void uptr, int type, int w, int h, int imageFlags, SWIGTYPE_p_unsigned_char data) {
    return nanovgJNI.glnvg__renderCreateTexture(SWIGTYPE_p_void.getCPtr(uptr), type, w, h, imageFlags, SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public static int glnvg__renderDeleteTexture(SWIGTYPE_p_void uptr, int image) {
    return nanovgJNI.glnvg__renderDeleteTexture(SWIGTYPE_p_void.getCPtr(uptr), image);
  }

  public static int glnvg__renderUpdateTexture(SWIGTYPE_p_void uptr, int image, int x, int y, int w, int h, SWIGTYPE_p_unsigned_char data) {
    return nanovgJNI.glnvg__renderUpdateTexture(SWIGTYPE_p_void.getCPtr(uptr), image, x, y, w, h, SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public static int glnvg__renderGetTextureSize(SWIGTYPE_p_void uptr, int image, SWIGTYPE_p_int w, SWIGTYPE_p_int h) {
    return nanovgJNI.glnvg__renderGetTextureSize(SWIGTYPE_p_void.getCPtr(uptr), image, SWIGTYPE_p_int.getCPtr(w), SWIGTYPE_p_int.getCPtr(h));
  }

  public static void glnvg__xformToMat3x4(SWIGTYPE_p_float m3, SWIGTYPE_p_float t) {
    nanovgJNI.glnvg__xformToMat3x4(SWIGTYPE_p_float.getCPtr(m3), SWIGTYPE_p_float.getCPtr(t));
  }

  public static NVGcolor glnvg__premulColor(NVGcolor c) {
    return new NVGcolor(nanovgJNI.glnvg__premulColor(NVGcolor.getCPtr(c), c), true);
  }

  public static int glnvg__convertPaint(GLNVGcontext gl, GLNVGfragUniforms frag, NVGpaint paint, NVGscissor scissor, float width, float fringe, float strokeThr) {
    return nanovgJNI.glnvg__convertPaint(GLNVGcontext.getCPtr(gl), gl, GLNVGfragUniforms.getCPtr(frag), frag, NVGpaint.getCPtr(paint), paint, NVGscissor.getCPtr(scissor), scissor, width, fringe, strokeThr);
  }

  public static GLNVGfragUniforms nvg__fragUniformPtr(GLNVGcontext gl, int i) {
    long cPtr = nanovgJNI.nvg__fragUniformPtr(GLNVGcontext.getCPtr(gl), gl, i);
    return (cPtr == 0) ? null : new GLNVGfragUniforms(cPtr, false);
  }

  public static void glnvg__setUniforms(GLNVGcontext gl, int uniformOffset, int image) {
    nanovgJNI.glnvg__setUniforms(GLNVGcontext.getCPtr(gl), gl, uniformOffset, image);
  }

  public static void glnvg__renderViewport(SWIGTYPE_p_void uptr, int width, int height, float devicePixelRatio) {
    nanovgJNI.glnvg__renderViewport(SWIGTYPE_p_void.getCPtr(uptr), width, height, devicePixelRatio);
  }

  public static void glnvg__fill(GLNVGcontext gl, GLNVGcall call) {
    nanovgJNI.glnvg__fill(GLNVGcontext.getCPtr(gl), gl, GLNVGcall.getCPtr(call), call);
  }

  public static void glnvg__convexFill(GLNVGcontext gl, GLNVGcall call) {
    nanovgJNI.glnvg__convexFill(GLNVGcontext.getCPtr(gl), gl, GLNVGcall.getCPtr(call), call);
  }

  public static void glnvg__stroke(GLNVGcontext gl, GLNVGcall call) {
    nanovgJNI.glnvg__stroke(GLNVGcontext.getCPtr(gl), gl, GLNVGcall.getCPtr(call), call);
  }

  public static void glnvg__triangles(GLNVGcontext gl, GLNVGcall call) {
    nanovgJNI.glnvg__triangles(GLNVGcontext.getCPtr(gl), gl, GLNVGcall.getCPtr(call), call);
  }

  public static void glnvg__renderCancel(SWIGTYPE_p_void uptr) {
    nanovgJNI.glnvg__renderCancel(SWIGTYPE_p_void.getCPtr(uptr));
  }

  public static SWIGTYPE_p_GLenum glnvg_convertBlendFuncFactor(int factor) {
    return new SWIGTYPE_p_GLenum(nanovgJNI.glnvg_convertBlendFuncFactor(factor), true);
  }

  public static void glnvg__blendCompositeOperation(NVGcompositeOperationState op) {
    nanovgJNI.glnvg__blendCompositeOperation(NVGcompositeOperationState.getCPtr(op), op);
  }

  public static void glnvg__renderFlush(SWIGTYPE_p_void uptr, NVGcompositeOperationState compositeOperation) {
    nanovgJNI.glnvg__renderFlush(SWIGTYPE_p_void.getCPtr(uptr), NVGcompositeOperationState.getCPtr(compositeOperation), compositeOperation);
  }

  public static int glnvg__maxVertCount(NVGpath paths, int npaths) {
    return nanovgJNI.glnvg__maxVertCount(NVGpath.getCPtr(paths), paths, npaths);
  }

  public static GLNVGcall glnvg__allocCall(GLNVGcontext gl) {
    long cPtr = nanovgJNI.glnvg__allocCall(GLNVGcontext.getCPtr(gl), gl);
    return (cPtr == 0) ? null : new GLNVGcall(cPtr, false);
  }

  public static int glnvg__allocPaths(GLNVGcontext gl, int n) {
    return nanovgJNI.glnvg__allocPaths(GLNVGcontext.getCPtr(gl), gl, n);
  }

  public static int glnvg__allocVerts(GLNVGcontext gl, int n) {
    return nanovgJNI.glnvg__allocVerts(GLNVGcontext.getCPtr(gl), gl, n);
  }

  public static int glnvg__allocFragUniforms(GLNVGcontext gl, int n) {
    return nanovgJNI.glnvg__allocFragUniforms(GLNVGcontext.getCPtr(gl), gl, n);
  }

  public static void glnvg__vset(NVGvertex vtx, float x, float y, float u, float v) {
    nanovgJNI.glnvg__vset(NVGvertex.getCPtr(vtx), vtx, x, y, u, v);
  }

  public static void glnvg__renderFill(SWIGTYPE_p_void uptr, NVGpaint paint, NVGscissor scissor, float fringe, SWIGTYPE_p_float bounds, NVGpath paths, int npaths) {
    nanovgJNI.glnvg__renderFill(SWIGTYPE_p_void.getCPtr(uptr), NVGpaint.getCPtr(paint), paint, NVGscissor.getCPtr(scissor), scissor, fringe, SWIGTYPE_p_float.getCPtr(bounds), NVGpath.getCPtr(paths), paths, npaths);
  }

  public static void glnvg__renderStroke(SWIGTYPE_p_void uptr, NVGpaint paint, NVGscissor scissor, float fringe, float strokeWidth, NVGpath paths, int npaths) {
    nanovgJNI.glnvg__renderStroke(SWIGTYPE_p_void.getCPtr(uptr), NVGpaint.getCPtr(paint), paint, NVGscissor.getCPtr(scissor), scissor, fringe, strokeWidth, NVGpath.getCPtr(paths), paths, npaths);
  }

  public static void glnvg__renderTriangles(SWIGTYPE_p_void uptr, NVGpaint paint, NVGscissor scissor, NVGvertex verts, int nverts) {
    nanovgJNI.glnvg__renderTriangles(SWIGTYPE_p_void.getCPtr(uptr), NVGpaint.getCPtr(paint), paint, NVGscissor.getCPtr(scissor), scissor, NVGvertex.getCPtr(verts), verts, nverts);
  }

  public static void glnvg__renderDelete(SWIGTYPE_p_void uptr) {
    nanovgJNI.glnvg__renderDelete(SWIGTYPE_p_void.getCPtr(uptr));
  }

  public static void nvgBeginFrame(SWIGTYPE_p_NVGcontext ctx, int windowWidth, int windowHeight, float devicePixelRatio) {
    nanovgJNI.nvgBeginFrame(SWIGTYPE_p_NVGcontext.getCPtr(ctx), windowWidth, windowHeight, devicePixelRatio);
  }

  public static float nvgDevicePixelRatio(SWIGTYPE_p_NVGcontext ctx) {
    return nanovgJNI.nvgDevicePixelRatio(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgCancelFrame(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgCancelFrame(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgEndFrame(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgEndFrame(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgGlobalCompositeOperation(SWIGTYPE_p_NVGcontext ctx, int op) {
    nanovgJNI.nvgGlobalCompositeOperation(SWIGTYPE_p_NVGcontext.getCPtr(ctx), op);
  }

  public static void nvgGlobalCompositeBlendFunc(SWIGTYPE_p_NVGcontext ctx, int sfactor, int dfactor) {
    nanovgJNI.nvgGlobalCompositeBlendFunc(SWIGTYPE_p_NVGcontext.getCPtr(ctx), sfactor, dfactor);
  }

  public static void nvgGlobalCompositeBlendFuncSeparate(SWIGTYPE_p_NVGcontext ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
    nanovgJNI.nvgGlobalCompositeBlendFuncSeparate(SWIGTYPE_p_NVGcontext.getCPtr(ctx), srcRGB, dstRGB, srcAlpha, dstAlpha);
  }

  public static NVGcolor nvgRGB(short r, short g, short b) {
    return new NVGcolor(nanovgJNI.nvgRGB(r, g, b), true);
  }

  public static NVGcolor nvgRGBf(float r, float g, float b) {
    return new NVGcolor(nanovgJNI.nvgRGBf(r, g, b), true);
  }

  public static NVGcolor nvgRGBA(short r, short g, short b, short a) {
    return new NVGcolor(nanovgJNI.nvgRGBA(r, g, b, a), true);
  }

  public static NVGcolor nvgRGBAf(float r, float g, float b, float a) {
    return new NVGcolor(nanovgJNI.nvgRGBAf(r, g, b, a), true);
  }

  public static NVGcolor nvgLerpRGBA(NVGcolor c0, NVGcolor c1, float u) {
    return new NVGcolor(nanovgJNI.nvgLerpRGBA(NVGcolor.getCPtr(c0), c0, NVGcolor.getCPtr(c1), c1, u), true);
  }

  public static NVGcolor nvgTransRGBA(NVGcolor c0, short a) {
    return new NVGcolor(nanovgJNI.nvgTransRGBA(NVGcolor.getCPtr(c0), c0, a), true);
  }

  public static NVGcolor nvgTransRGBAf(NVGcolor c0, float a) {
    return new NVGcolor(nanovgJNI.nvgTransRGBAf(NVGcolor.getCPtr(c0), c0, a), true);
  }

  public static NVGcolor nvgHSL(float h, float s, float l) {
    return new NVGcolor(nanovgJNI.nvgHSL(h, s, l), true);
  }

  public static NVGcolor nvgHSLA(float h, float s, float l, short a) {
    return new NVGcolor(nanovgJNI.nvgHSLA(h, s, l, a), true);
  }

  public static void nvgSave(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgSave(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgRestore(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgRestore(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgReset(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgReset(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgStrokeColor(SWIGTYPE_p_NVGcontext ctx, NVGcolor color) {
    nanovgJNI.nvgStrokeColor(SWIGTYPE_p_NVGcontext.getCPtr(ctx), NVGcolor.getCPtr(color), color);
  }

  public static void nvgStrokePaint(SWIGTYPE_p_NVGcontext ctx, NVGpaint paint) {
    nanovgJNI.nvgStrokePaint(SWIGTYPE_p_NVGcontext.getCPtr(ctx), NVGpaint.getCPtr(paint), paint);
  }

  public static void nvgFillColor(SWIGTYPE_p_NVGcontext ctx, NVGcolor color) {
    nanovgJNI.nvgFillColor(SWIGTYPE_p_NVGcontext.getCPtr(ctx), NVGcolor.getCPtr(color), color);
  }

  public static void nvgFillPaint(SWIGTYPE_p_NVGcontext ctx, NVGpaint paint) {
    nanovgJNI.nvgFillPaint(SWIGTYPE_p_NVGcontext.getCPtr(ctx), NVGpaint.getCPtr(paint), paint);
  }

  public static void nvgMiterLimit(SWIGTYPE_p_NVGcontext ctx, float limit) {
    nanovgJNI.nvgMiterLimit(SWIGTYPE_p_NVGcontext.getCPtr(ctx), limit);
  }

  public static void nvgStrokeWidth(SWIGTYPE_p_NVGcontext ctx, float size) {
    nanovgJNI.nvgStrokeWidth(SWIGTYPE_p_NVGcontext.getCPtr(ctx), size);
  }

  public static void nvgLineCap(SWIGTYPE_p_NVGcontext ctx, int cap) {
    nanovgJNI.nvgLineCap(SWIGTYPE_p_NVGcontext.getCPtr(ctx), cap);
  }

  public static void nvgLineJoin(SWIGTYPE_p_NVGcontext ctx, int join) {
    nanovgJNI.nvgLineJoin(SWIGTYPE_p_NVGcontext.getCPtr(ctx), join);
  }

  public static void nvgGlobalAlpha(SWIGTYPE_p_NVGcontext ctx, float alpha) {
    nanovgJNI.nvgGlobalAlpha(SWIGTYPE_p_NVGcontext.getCPtr(ctx), alpha);
  }

  public static void nvgResetTransform(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgResetTransform(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgTransform(SWIGTYPE_p_NVGcontext ctx, float a, float b, float c, float d, float e, float f) {
    nanovgJNI.nvgTransform(SWIGTYPE_p_NVGcontext.getCPtr(ctx), a, b, c, d, e, f);
  }

  public static void nvgTranslate(SWIGTYPE_p_NVGcontext ctx, float x, float y) {
    nanovgJNI.nvgTranslate(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y);
  }

  public static void nvgRotate(SWIGTYPE_p_NVGcontext ctx, float angle) {
    nanovgJNI.nvgRotate(SWIGTYPE_p_NVGcontext.getCPtr(ctx), angle);
  }

  public static void nvgSkewX(SWIGTYPE_p_NVGcontext ctx, float angle) {
    nanovgJNI.nvgSkewX(SWIGTYPE_p_NVGcontext.getCPtr(ctx), angle);
  }

  public static void nvgSkewY(SWIGTYPE_p_NVGcontext ctx, float angle) {
    nanovgJNI.nvgSkewY(SWIGTYPE_p_NVGcontext.getCPtr(ctx), angle);
  }

  public static void nvgScale(SWIGTYPE_p_NVGcontext ctx, float x, float y) {
    nanovgJNI.nvgScale(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y);
  }

  public static void nvgCurrentTransform(SWIGTYPE_p_NVGcontext ctx, SWIGTYPE_p_float xform) {
    nanovgJNI.nvgCurrentTransform(SWIGTYPE_p_NVGcontext.getCPtr(ctx), SWIGTYPE_p_float.getCPtr(xform));
  }

  public static void nvgTransformIdentity(SWIGTYPE_p_float dst) {
    nanovgJNI.nvgTransformIdentity(SWIGTYPE_p_float.getCPtr(dst));
  }

  public static void nvgTransformTranslate(SWIGTYPE_p_float dst, float tx, float ty) {
    nanovgJNI.nvgTransformTranslate(SWIGTYPE_p_float.getCPtr(dst), tx, ty);
  }

  public static void nvgTransformScale(SWIGTYPE_p_float dst, float sx, float sy) {
    nanovgJNI.nvgTransformScale(SWIGTYPE_p_float.getCPtr(dst), sx, sy);
  }

  public static void nvgTransformRotate(SWIGTYPE_p_float dst, float a) {
    nanovgJNI.nvgTransformRotate(SWIGTYPE_p_float.getCPtr(dst), a);
  }

  public static void nvgTransformSkewX(SWIGTYPE_p_float dst, float a) {
    nanovgJNI.nvgTransformSkewX(SWIGTYPE_p_float.getCPtr(dst), a);
  }

  public static void nvgTransformSkewY(SWIGTYPE_p_float dst, float a) {
    nanovgJNI.nvgTransformSkewY(SWIGTYPE_p_float.getCPtr(dst), a);
  }

  public static void nvgTransformMultiply(SWIGTYPE_p_float dst, SWIGTYPE_p_float src) {
    nanovgJNI.nvgTransformMultiply(SWIGTYPE_p_float.getCPtr(dst), SWIGTYPE_p_float.getCPtr(src));
  }

  public static void nvgTransformPremultiply(SWIGTYPE_p_float dst, SWIGTYPE_p_float src) {
    nanovgJNI.nvgTransformPremultiply(SWIGTYPE_p_float.getCPtr(dst), SWIGTYPE_p_float.getCPtr(src));
  }

  public static int nvgTransformInverse(SWIGTYPE_p_float dst, SWIGTYPE_p_float src) {
    return nanovgJNI.nvgTransformInverse(SWIGTYPE_p_float.getCPtr(dst), SWIGTYPE_p_float.getCPtr(src));
  }

  public static void nvgTransformPoint(SWIGTYPE_p_float dstx, SWIGTYPE_p_float dsty, SWIGTYPE_p_float xform, float srcx, float srcy) {
    nanovgJNI.nvgTransformPoint(SWIGTYPE_p_float.getCPtr(dstx), SWIGTYPE_p_float.getCPtr(dsty), SWIGTYPE_p_float.getCPtr(xform), srcx, srcy);
  }

  public static float nvgDegToRad(float deg) {
    return nanovgJNI.nvgDegToRad(deg);
  }

  public static float nvgRadToDeg(float rad) {
    return nanovgJNI.nvgRadToDeg(rad);
  }

  public static int nvgCreateImage(SWIGTYPE_p_NVGcontext ctx, String filename, int imageFlags) {
    return nanovgJNI.nvgCreateImage(SWIGTYPE_p_NVGcontext.getCPtr(ctx), filename, imageFlags);
  }

  public static int nvgCreateImageMem(SWIGTYPE_p_NVGcontext ctx, int imageFlags, SWIGTYPE_p_unsigned_char data, int ndata) {
    return nanovgJNI.nvgCreateImageMem(SWIGTYPE_p_NVGcontext.getCPtr(ctx), imageFlags, SWIGTYPE_p_unsigned_char.getCPtr(data), ndata);
  }

  public static int nvgCreateImageRGBA(SWIGTYPE_p_NVGcontext ctx, int w, int h, int imageFlags, SWIGTYPE_p_unsigned_char data) {
    return nanovgJNI.nvgCreateImageRGBA(SWIGTYPE_p_NVGcontext.getCPtr(ctx), w, h, imageFlags, SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public static void nvgUpdateImage(SWIGTYPE_p_NVGcontext ctx, int image, SWIGTYPE_p_unsigned_char data) {
    nanovgJNI.nvgUpdateImage(SWIGTYPE_p_NVGcontext.getCPtr(ctx), image, SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public static void nvgImageSize(SWIGTYPE_p_NVGcontext ctx, int image, SWIGTYPE_p_int w, SWIGTYPE_p_int h) {
    nanovgJNI.nvgImageSize(SWIGTYPE_p_NVGcontext.getCPtr(ctx), image, SWIGTYPE_p_int.getCPtr(w), SWIGTYPE_p_int.getCPtr(h));
  }

  public static void nvgDeleteImage(SWIGTYPE_p_NVGcontext ctx, int image) {
    nanovgJNI.nvgDeleteImage(SWIGTYPE_p_NVGcontext.getCPtr(ctx), image);
  }

  public static NVGpaint nvgLinearGradient(SWIGTYPE_p_NVGcontext ctx, float sx, float sy, float ex, float ey, NVGcolor icol, NVGcolor ocol) {
    return new NVGpaint(nanovgJNI.nvgLinearGradient(SWIGTYPE_p_NVGcontext.getCPtr(ctx), sx, sy, ex, ey, NVGcolor.getCPtr(icol), icol, NVGcolor.getCPtr(ocol), ocol), true);
  }

  public static NVGpaint nvgBoxGradient(SWIGTYPE_p_NVGcontext ctx, float x, float y, float w, float h, float r, float f, NVGcolor icol, NVGcolor ocol) {
    return new NVGpaint(nanovgJNI.nvgBoxGradient(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, w, h, r, f, NVGcolor.getCPtr(icol), icol, NVGcolor.getCPtr(ocol), ocol), true);
  }

  public static NVGpaint nvgRadialGradient(SWIGTYPE_p_NVGcontext ctx, float cx, float cy, float inr, float outr, NVGcolor icol, NVGcolor ocol) {
    return new NVGpaint(nanovgJNI.nvgRadialGradient(SWIGTYPE_p_NVGcontext.getCPtr(ctx), cx, cy, inr, outr, NVGcolor.getCPtr(icol), icol, NVGcolor.getCPtr(ocol), ocol), true);
  }

  public static NVGpaint nvgImagePattern(SWIGTYPE_p_NVGcontext ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha) {
    return new NVGpaint(nanovgJNI.nvgImagePattern(SWIGTYPE_p_NVGcontext.getCPtr(ctx), ox, oy, ex, ey, angle, image, alpha), true);
  }

  public static void nvgScissor(SWIGTYPE_p_NVGcontext ctx, float x, float y, float w, float h) {
    nanovgJNI.nvgScissor(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, w, h);
  }

  public static void nvgIntersectScissor(SWIGTYPE_p_NVGcontext ctx, float x, float y, float w, float h) {
    nanovgJNI.nvgIntersectScissor(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, w, h);
  }

  public static void nvgResetScissor(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgResetScissor(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgBeginPath(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgBeginPath(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgMoveTo(SWIGTYPE_p_NVGcontext ctx, float x, float y) {
    nanovgJNI.nvgMoveTo(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y);
  }

  public static void nvgLineTo(SWIGTYPE_p_NVGcontext ctx, float x, float y) {
    nanovgJNI.nvgLineTo(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y);
  }

  public static void nvgBezierTo(SWIGTYPE_p_NVGcontext ctx, float c1x, float c1y, float c2x, float c2y, float x, float y) {
    nanovgJNI.nvgBezierTo(SWIGTYPE_p_NVGcontext.getCPtr(ctx), c1x, c1y, c2x, c2y, x, y);
  }

  public static void nvgQuadTo(SWIGTYPE_p_NVGcontext ctx, float cx, float cy, float x, float y) {
    nanovgJNI.nvgQuadTo(SWIGTYPE_p_NVGcontext.getCPtr(ctx), cx, cy, x, y);
  }

  public static void nvgArcTo(SWIGTYPE_p_NVGcontext ctx, float x1, float y1, float x2, float y2, float radius) {
    nanovgJNI.nvgArcTo(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x1, y1, x2, y2, radius);
  }

  public static void nvgClosePath(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgClosePath(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgPathWinding(SWIGTYPE_p_NVGcontext ctx, int dir) {
    nanovgJNI.nvgPathWinding(SWIGTYPE_p_NVGcontext.getCPtr(ctx), dir);
  }

  public static void nvgArc(SWIGTYPE_p_NVGcontext ctx, float cx, float cy, float r, float a0, float a1, int dir) {
    nanovgJNI.nvgArc(SWIGTYPE_p_NVGcontext.getCPtr(ctx), cx, cy, r, a0, a1, dir);
  }

  public static void nvgRect(SWIGTYPE_p_NVGcontext ctx, float x, float y, float w, float h) {
    nanovgJNI.nvgRect(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, w, h);
  }

  public static void nvgRoundedRect(SWIGTYPE_p_NVGcontext ctx, float x, float y, float w, float h, float r) {
    nanovgJNI.nvgRoundedRect(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, w, h, r);
  }

  public static void nvgRoundedRectVarying(SWIGTYPE_p_NVGcontext ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft) {
    nanovgJNI.nvgRoundedRectVarying(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
  }

  public static void nvgEllipse(SWIGTYPE_p_NVGcontext ctx, float cx, float cy, float rx, float ry) {
    nanovgJNI.nvgEllipse(SWIGTYPE_p_NVGcontext.getCPtr(ctx), cx, cy, rx, ry);
  }

  public static void nvgCircle(SWIGTYPE_p_NVGcontext ctx, float cx, float cy, float r) {
    nanovgJNI.nvgCircle(SWIGTYPE_p_NVGcontext.getCPtr(ctx), cx, cy, r);
  }

  public static void nvgFill(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgFill(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static void nvgStroke(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgStroke(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static int nvgCreateFont(SWIGTYPE_p_NVGcontext ctx, String name, String filename) {
    return nanovgJNI.nvgCreateFont(SWIGTYPE_p_NVGcontext.getCPtr(ctx), name, filename);
  }

  public static int nvgCreateFontMem(SWIGTYPE_p_NVGcontext ctx, String name, SWIGTYPE_p_unsigned_char data, int ndata, int freeData) {
    return nanovgJNI.nvgCreateFontMem(SWIGTYPE_p_NVGcontext.getCPtr(ctx), name, SWIGTYPE_p_unsigned_char.getCPtr(data), ndata, freeData);
  }

  public static int nvgFindFont(SWIGTYPE_p_NVGcontext ctx, String name) {
    return nanovgJNI.nvgFindFont(SWIGTYPE_p_NVGcontext.getCPtr(ctx), name);
  }

  public static int nvgAddFallbackFontId(SWIGTYPE_p_NVGcontext ctx, int baseFont, int fallbackFont) {
    return nanovgJNI.nvgAddFallbackFontId(SWIGTYPE_p_NVGcontext.getCPtr(ctx), baseFont, fallbackFont);
  }

  public static int nvgAddFallbackFont(SWIGTYPE_p_NVGcontext ctx, String baseFont, String fallbackFont) {
    return nanovgJNI.nvgAddFallbackFont(SWIGTYPE_p_NVGcontext.getCPtr(ctx), baseFont, fallbackFont);
  }

  public static void nvgFontSize(SWIGTYPE_p_NVGcontext ctx, float size) {
    nanovgJNI.nvgFontSize(SWIGTYPE_p_NVGcontext.getCPtr(ctx), size);
  }

  public static void nvgFontBlur(SWIGTYPE_p_NVGcontext ctx, float blur) {
    nanovgJNI.nvgFontBlur(SWIGTYPE_p_NVGcontext.getCPtr(ctx), blur);
  }

  public static void nvgTextLetterSpacing(SWIGTYPE_p_NVGcontext ctx, float spacing) {
    nanovgJNI.nvgTextLetterSpacing(SWIGTYPE_p_NVGcontext.getCPtr(ctx), spacing);
  }

  public static void nvgTextLineHeight(SWIGTYPE_p_NVGcontext ctx, float lineHeight) {
    nanovgJNI.nvgTextLineHeight(SWIGTYPE_p_NVGcontext.getCPtr(ctx), lineHeight);
  }

  public static void nvgTextAlign(SWIGTYPE_p_NVGcontext ctx, int align) {
    nanovgJNI.nvgTextAlign(SWIGTYPE_p_NVGcontext.getCPtr(ctx), align);
  }

  public static void nvgFontFaceId(SWIGTYPE_p_NVGcontext ctx, int font) {
    nanovgJNI.nvgFontFaceId(SWIGTYPE_p_NVGcontext.getCPtr(ctx), font);
  }

  public static void nvgFontFace(SWIGTYPE_p_NVGcontext ctx, String font) {
    nanovgJNI.nvgFontFace(SWIGTYPE_p_NVGcontext.getCPtr(ctx), font);
  }

  public static float nvgText(SWIGTYPE_p_NVGcontext ctx, float x, float y, String string, String end) {
    return nanovgJNI.nvgText(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, string, end);
  }

  public static void nvgTextBox(SWIGTYPE_p_NVGcontext ctx, float x, float y, float breakRowWidth, String string, String end) {
    nanovgJNI.nvgTextBox(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, breakRowWidth, string, end);
  }

  public static float nvgTextBounds(SWIGTYPE_p_NVGcontext ctx, float x, float y, String string, String end, SWIGTYPE_p_float bounds) {
    return nanovgJNI.nvgTextBounds(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, string, end, SWIGTYPE_p_float.getCPtr(bounds));
  }

  public static void nvgTextBoxBounds(SWIGTYPE_p_NVGcontext ctx, float x, float y, float breakRowWidth, String string, String end, SWIGTYPE_p_float bounds) {
    nanovgJNI.nvgTextBoxBounds(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, breakRowWidth, string, end, SWIGTYPE_p_float.getCPtr(bounds));
  }

  public static int nvgTextGlyphPositions(SWIGTYPE_p_NVGcontext ctx, float x, float y, String string, String end, NVGglyphPosition positions, int maxPositions) {
    return nanovgJNI.nvgTextGlyphPositions(SWIGTYPE_p_NVGcontext.getCPtr(ctx), x, y, string, end, NVGglyphPosition.getCPtr(positions), positions, maxPositions);
  }

  public static void nvgTextMetrics(SWIGTYPE_p_NVGcontext ctx, SWIGTYPE_p_float ascender, SWIGTYPE_p_float descender, SWIGTYPE_p_float lineh) {
    nanovgJNI.nvgTextMetrics(SWIGTYPE_p_NVGcontext.getCPtr(ctx), SWIGTYPE_p_float.getCPtr(ascender), SWIGTYPE_p_float.getCPtr(descender), SWIGTYPE_p_float.getCPtr(lineh));
  }

  public static int nvgTextBreakLines(SWIGTYPE_p_NVGcontext ctx, String string, String end, float breakRowWidth, NVGtextRow rows, int maxRows) {
    return nanovgJNI.nvgTextBreakLines(SWIGTYPE_p_NVGcontext.getCPtr(ctx), string, end, breakRowWidth, NVGtextRow.getCPtr(rows), rows, maxRows);
  }

  public static SWIGTYPE_p_NVGcontext nvgCreateInternal(NVGparams params) {
    long cPtr = nanovgJNI.nvgCreateInternal(NVGparams.getCPtr(params), params);
    return (cPtr == 0) ? null : new SWIGTYPE_p_NVGcontext(cPtr, false);
  }

  public static void nvgDeleteInternal(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgDeleteInternal(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

  public static NVGparams nvgInternalParams(SWIGTYPE_p_NVGcontext ctx) {
    long cPtr = nanovgJNI.nvgInternalParams(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
    return (cPtr == 0) ? null : new NVGparams(cPtr, false);
  }

  public static void nvgDebugDumpPathCache(SWIGTYPE_p_NVGcontext ctx) {
    nanovgJNI.nvgDebugDumpPathCache(SWIGTYPE_p_NVGcontext.getCPtr(ctx));
  }

}
