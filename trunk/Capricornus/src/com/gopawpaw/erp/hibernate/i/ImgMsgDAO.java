package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ImgMsg entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.ImgMsg
 * @author MyEclipse Persistence Tools
 */

public class ImgMsgDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ImgMsgDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ImgMsg transientInstance) {
		log.debug("saving ImgMsg instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ImgMsg persistentInstance) {
		log.debug("deleting ImgMsg instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ImgMsg findById(com.gopawpaw.erp.hibernate.i.ImgMsgId id) {
		log.debug("getting ImgMsg instance with id: " + id);
		try {
			ImgMsg instance = (ImgMsg) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.ImgMsg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ImgMsg instance) {
		log.debug("finding ImgMsg instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ImgMsg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ImgMsg as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ImgMsg instances");
		try {
			String queryString = "from ImgMsg";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ImgMsg merge(ImgMsg detachedInstance) {
		log.debug("merging ImgMsg instance");
		try {
			ImgMsg result = (ImgMsg) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ImgMsg instance) {
		log.debug("attaching dirty ImgMsg instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ImgMsg instance) {
		log.debug("attaching clean ImgMsg instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ImgMsgDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ImgMsgDAO) ctx.getBean("ImgMsgDAO");
	}
}